package day21.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输出流，将计算机内存中的数据，写入到一个指定的文件中或发送到网络
 * */
public class Demo2_FileOutputStream {
	public static void main(String[] args) throws IOException {
		//1、创建一个输出流对象，对象关联输出文件，同时自动打开流
		//1.1、声明一个文件
		String name="aaa.txt";
		//1.2、创建对象,第二个参数代表是否追加
		FileOutputStream fos=new FileOutputStream(name,true);//每次内容覆盖
		
		//2、将内存中的数据写入到流中
		//1、将数据写入到流中
		String str="hello world!";
		//2、将String类型转换成byte数组
		byte[] b=str.getBytes();
		fos.write(b);
		fos.write(b, 0, b.length);//将b数组中从0开始的位置到数组长度的字节写入到指定文件
		fos.write(97);//写入单个字符
		//3、强制刷入流中的数据，到文件中
		fos.flush();
		
		//4、关闭流
		fos.close();
	}
}
