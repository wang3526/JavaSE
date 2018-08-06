package day12.string;

import java.util.Scanner;

/**
 * 字符串反转
 * 	键盘录入"abc"
 * 输出结果"cba"
 * 
 * 分析：
 * 1、通过键盘录入获取字符串
 * 2、将字符串转换成字符数组
 * 3、到着遍历字符数组，并拼接成字符串
 * 4、打印
 * */
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();     //将键盘录入的字符串存储在line中
		char[] arr=line.toCharArray(); //将字符串转换成字符数组
		String s="";
		for(int i=arr.length-1;i>=0;i--){
			s=s+arr[i];
		}
		System.out.println(s);
	}
}
