package day23.io.charstream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo6_BufferedWriter {
	/**
	 * BufferedWriter是Writer的子类
	 * 1、可以写入一行数据，可以换行
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//1、创建BufferedWriter对象
		//1.1、指定编码格式
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("aaa.txt"),"GBK"));
		//1.2、使用平台默认编码格式
		BufferedWriter bw=new BufferedWriter(new FileWriter("aaa.txt",true));
		
		//2、写出数据
		bw.write("你好你好");
		//换行
		bw.newLine();
		//bw.write("小乔、大乔");
		//刷入
		bw.flush();
		//3、关闭流
		bw.close();
	}
}
