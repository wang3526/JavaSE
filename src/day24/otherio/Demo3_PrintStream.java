package day24.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo3_PrintStream {
	/**
	 * PrintStream
	 * 打印输出流，可以输出字节流可以向不同的流中输出数据，自带换行符
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//创建PrintStream对象
		PrintStream ps=new PrintStream(new FileOutputStream("xxx.txt"));
		//写入数据
		ps.print(true);
		ps.print(123);
		ps.print(12.3f);
		ps.print("hello");
		//关闭流
		ps.close();
	}
}
