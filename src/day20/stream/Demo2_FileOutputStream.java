package day20.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {
	/**
	 * @throws IOException 
	 * FileOutputStream在创建对象的时候，如果没有这个文件会帮我创建出来
	 * 如果有会清空，在写入
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos=new FileOutputStream("yyy.txt",true);//如果想续写，就在第二个参数传true
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		fos.close();
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos=new FileOutputStream("yyy.txt");//创建字节输出流对象，如果没有就自动创建一个
		/*fos.write(97);//虽然写出的是一个int数，但是会自动去除前3个八位
		fos.write(98);
		fos.write(99);*/
		fos.write(100);
		
		
		fos.close();
	}
}
