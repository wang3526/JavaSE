package day18.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test1 {
	/**
	 * * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入.
	 *  把所有输入的整数倒序排列打印.
	 *  
	 *  分析：
	 *  1、创建Scanner对象键盘录入
	 *  2、创建TreeSet集合对象，TreeSet集合中传入比较器
	 *  3、无限循环不断接收整数，遇到quit结束，因为推出时quit，所以键盘录入都已字符串形式
	 *  4、判断是quit就退出，不是转换成Integer，并添加到集合中
	 *  5、遍历TreeSet集合并打印每一个元素
	 * */
	public static void main(String[] args) {
		//1、创建Scanner对象键盘录入
		Scanner sc=new Scanner(System.in);
		//2、创建TreeSet集合对象，TreeSet集合中传入比较器
		TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				int num=i2-i1;  //自动拆箱
				return num==0?1:num;
			}
		});
		//3、无限循环不断接收整数，遇到quit结束，因为推出时quit，所以键盘录入都已字符串形式
		while(true){
			System.out.println("请输入：");
			String line=sc.nextLine(); //将键盘录入的字符串存储在line
			if("quit".equals(line)){
				break;
			}
			//4、判断是quit就退出，不是转换成Integer，并添加到集合中
			Integer i=Integer.parseInt(line);
			ts.add(i);
		}
		// 5、遍历TreeSet集合并打印每一个元素
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}
}
