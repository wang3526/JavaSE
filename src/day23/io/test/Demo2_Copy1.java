package day23.io.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2_Copy1 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("xxx.txt");
		FileWriter fw=new FileWriter("copy2.txt");
		
		int len;
		char[] arr=new char[100];
		while((len=fr.read(arr))!=-1){
			fw.write(arr, 0, len);
		}
		
		fr.close();
		fw.close();
	}
}
