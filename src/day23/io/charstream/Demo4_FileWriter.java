package day23.io.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo4_FileWriter {
	/**
	 * FileWriter是OutputStreamWriter的子类
	 * @throws IOException 
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		//1、创建FileWriter对象
		FileWriter fw=new FileWriter("aaa.txt", true);
		//2、写入字符
		//2.1、写入单个字符
		fw.write('你');
		fw.write("小乔、大乔、周瑜、孙策");
		//刷入
		fw.flush();
		//3、关闭流
		fw.close();
		
	}
}
