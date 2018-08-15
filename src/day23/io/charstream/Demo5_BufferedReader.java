package day23.io.charstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo5_BufferedReader {
	/**
	 * BufferedReader是Reader的子类
	 * 最大特点：每次可以读取一行，一行的定义就是读取到换行符算一行结束
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//1、创建BufferedReader对象
		//使用手动设置编码格式
		/*BufferedReader br=
				new BufferedReader(new InputStreamReader(new FileInputStream("aaa.txt")));*/
		//使用平台默认编码格式
		BufferedReader br=new BufferedReader(new FileReader("aaa.txt"));//需要一个Reader对象
		//2、读取数据
		/*//读取单个字符
		System.out.println((char)br.read());
		//读取多个字符
		char[] arr=new char[3];
		br.read(arr);
		System.out.println(new String(arr));
		//读取一行字符串，碰到换行符结束
		System.out.println(br.readLine());*/
		String str=null;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		
		
		//3、关闭流
		br.close();
	}
}
