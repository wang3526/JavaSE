package day23.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo3_FileReader {
	/**
	 * FileReader是InputStreamReader的子类
	 * 只能使用平台默认的字符编码格式
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//1、创建一个FileReader对象
		FileReader fr=new FileReader("aaa.txt");
		//2、读取字符
			//2.1、声明一个字符缓冲区
		char[] arr=new char[10];
			//2.2、声明接收长度的变量
		int len;
		//2.3、循环读取字符
		while((len=fr.read(arr))!=-1){
			System.out.print(new String(arr,0,len));
		}
		//3、关闭流
		fr.close();
		
	}
}
