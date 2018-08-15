package day23.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo1_Copy {
	public static void main(String[] args) throws IOException {
		//创建InputStreamReader对象，关联字节流对象
		InputStreamReader isr=new InputStreamReader(new FileInputStream("xxx.txt"));
		//创建OutputStreamReader对象，关联字节流对象
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("copy1.txt"));
		
		//声明长度变量
		int len;
		//定义字符数组
		char[] arr=new char[100];
		//读取字符到字符数组中
		while((len=isr.read(arr))!=-1){
			//写出字符数组中的数据
			osw.write(arr, 0, len);
		}
		
		//关闭流
		isr.close();
		osw.close();
	}
}
