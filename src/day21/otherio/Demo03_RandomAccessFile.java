package day21.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo03_RandomAccessFile {
	/**
	 * RandomAccessFile
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("aaa.txt", "rw");
		//raf.write(97);
		//int x=raf.read();
		//System.out.println(x);
		raf.seek(0);//在指定位置设置指针
		raf.write(98);
		
		raf.close();
		
	}
}
