package day20.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("yyy.txt");
		fw.write("大家好，基础班快接近尾声了。");
		fw.write(97);
		fw.close();
	}
}
