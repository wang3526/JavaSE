package day23.io.charstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo2_OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		//创建字符输出流，关联字节流
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("aaa.txt",true));
		//写出数据
		//单个字符
		osw.write('a');
		//字符数组
		char[] arr={'b','c','d','2','3','4'};
		osw.write(arr);
		//写入字符数组，从数组中哪个位置开始，刷入多少个字符
		osw.write(arr, 2, 1);
		//写入字符串
		String line="小乔、大乔";
		osw.write(line);
		
		//刷入
		osw.flush();
		//关闭流
		osw.close();
	}
}
