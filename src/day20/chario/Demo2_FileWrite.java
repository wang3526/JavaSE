package day20.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("yyy.txt");
		fw.write("��Һã��������ӽ�β���ˡ�");
		fw.write(97);
		fw.close();
	}
}
