package day24.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo4_PrintWriter {
	public static void main(String[] args) throws IOException {
		//创建PrintWriter对象
		PrintWriter pw=new PrintWriter("xxx.txt");
		//写入数据
		pw.write(97);
		pw.write("hello world");
		pw.write("你好，我好，大家好", 3, 2);
		
		//关闭流
		pw.close();
	}
}
