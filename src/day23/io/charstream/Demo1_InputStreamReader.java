package day23.io.charstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1_InputStreamReader {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
		InputStreamReader isr=new InputStreamReader(new FileInputStream("aaa.txt"));
		
		//读取单个字符
		System.out.print((char)isr.read());
		
		//读取字符到字符数组中
		int b;
		char[] chuf=new char[5];
		while((b=isr.read(chuf))!=-1){
			//处理接收的数据，将字符数组转换成string类型
			System.out.print(new String(chuf, 0, b));
		}
		
		isr.close();
	}
}
