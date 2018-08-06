package day12.scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
/*		System.out.println("请输入第一个整数:");
		int i=sc.nextInt();
		System.out.println("请输入第二个整数：");
		int j=sc.nextInt();
		System.out.println("i="+i+"j="+j);*/
		
	/*	System.out.println("请输入第一个字符串：");
		String line1=sc.nextLine();
		System.out.println("请输入第二个字符串：");
		String line2=sc.nextLine();
		System.out.println("line1="+line1+" line2="+line2);*/
		
		/**
		 * nextInt()是键盘录入整数的方法，当我们录入10的时候
		 * 其实在键盘上录入的是10和\r\n，nextInt()方法只获取10就结束了
		 * nextLine()是键盘录入字符串的方法，可以结束任意类型，
		 * 通过\r\n，只要遇到\r\n就证明一行结束。
		 * */
	/*	System.out.println("请输入第一个整数:");
		int i=sc.nextInt();
		System.out.println("请输入第一个字符串：");
		String line1=sc.nextLine();
		System.out.println("i="+i+" line1="+line1);*/
		
		/**
		 * 解决方案
		 * 1、创建两次对象，但是浪费空间
		 * 2、键盘录入的都是字符串，都用nextLine()方法，后面讲整数字符串装换成整数的方法
		 * */
 		int i=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		String line=sc2.nextLine();
		System.out.println(i);
		System.out.println(line);
		
		
	}
		
}
