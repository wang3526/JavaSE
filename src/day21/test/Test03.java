package day21.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Test03 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("Tulips.jpg"));//改变标准输入流
		System.setOut(new PrintStream("copy.jpg"));//改变标准输出流
		
		InputStream is=System.in;
		PrintStream ps=System.out;
		
		byte[] arr=new byte[1024];
		int len;
		
		while((len=is.read(arr))!=-1){
			ps.write(arr);
		}
		
		is.close();
		ps.close();
		
	}
}
