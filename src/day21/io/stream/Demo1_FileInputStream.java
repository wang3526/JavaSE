package day21.io.stream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 输入流 ，将程序外部的数据，读取到内存中
 * */
public class Demo1_FileInputStream {
	public static void main(String[] args) throws IOException {
		//1、创建一个输入字节流对象，关联指定要操作的文件
		//1.1、声明文件路径
		String path="aaa.txt";//数据源
		//1.2、初始化输入流对象
		FileInputStream fis=new FileInputStream(path);
		//2、读取操作
		//2.1、看流中剩余的字节
		System.out.println(fis.available());
		//2.2、读取一个字节
		//System.out.println(fis.read());
		//System.out.println(fis.available());
		
		//声明缓冲区
		/*byte[] b=new byte[fis.available()];
		int len=fis.read(b); //将流中的数据读取到byte数组中，返回本次接收的字节数
		System.out.println(len);*/
		
		byte[] b=new byte[4];
		int len;
		while((len=fis.read(b))!=-1){
			System.out.print(new String(b,0,len));
		}
		
		
		//3、关闭流
		fis.close();
	}
}
