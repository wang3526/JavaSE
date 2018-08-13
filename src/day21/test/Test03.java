package day21.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Test03 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("Tulips.jpg"));//�ı��׼������
		System.setOut(new PrintStream("copy.jpg"));//�ı��׼�����
		
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
