package day23.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("copy3.txt"));
		
		String str=null;
		while((str=br.readLine())!=null){
			bw.write(str);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
