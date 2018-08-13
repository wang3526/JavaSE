package day21.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import day16.arraylist.Person;

public class Demo07_PrintStream {
	/**
	 * PrintStream和PrintWrite分别打印的是字节流和字符流
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		PrintWriter pw=new PrintWriter(new FileOutputStream("bbb.txt"),true);
		//pw.println(97);//自动刷出功能只针对的是println方法
		//pw.write(97);
		pw.print(97);
		pw.println(97);
		pw.close();
		
		
	}

	private static void demo1() {
		System.out.println("aaa");
		PrintStream ps=System.out;//获取标准输出流
		ps.println(97);//底层通过Integer.toString()将97转换成字符串并打印
		ps.write(97); //查找码表，找到对应的a并打印
		
		Person p1=new Person("张三",23);
		ps.println(p1);//默认调用p1的toString方法
		
		Person p2=null;
		ps.println(p2);//打印引用数据类型，如果是null，就打印null，如果不是null。就打印对象的toString方法
		ps.close();
	}
}
