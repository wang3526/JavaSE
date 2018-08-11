package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {
	/**
	 * * read()方法读取的是一个字节,为什么返回是int,而不是byte
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis=new FileInputStream("aaa.txt");//创建流对象
		int b;
		while((b=fis.read()) != -1){
			System.out.println(b);
		}
		
		fis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("aaa.txt");//创建流对象
		int x=fis.read();//从硬盘上读取一个字节
		System.out.println(x);
		
		int y=fis.read();
		System.out.println(y);
		
		int z=fis.read();
		System.out.println(z);
		
		int a=fis.read();
		System.out.println(a);
		fis.close();//关流释放资源
	}
}
