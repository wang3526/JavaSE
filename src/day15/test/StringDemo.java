package day15.test;

import java.io.UnsupportedEncodingException;

public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str1="ABCD";
		String str2=new String("ABCD");
		System.out.println(str1);
		byte[] b={97,98,99};
		str1=new String(b, "GBK");
		System.out.println(str1);
		
		String str3="abcd";
		String str4="aacd";
		System.out.println(str3.compareTo(str4));//比较两个字符串，按字典顺序
		System.out.println(str2.compareToIgnoreCase(str3));//比较两个字符串，不区分大小写
		System.out.println(str4.concat("ef"));//在字符串的尾部追加字符串
		System.out.println(str4.contains("aa"));//查看是否含有子串
		System.out.println(str4.endsWith("d"));
		System.out.println(str1.equals(str4));
		System.out.println(str4.indexOf('a'));
		System.out.println(str4.lastIndexOf("b"));
		System.out.println("".isEmpty());
		System.out.println(str1.length());
		String str="轻轻的我走了,正如我轻轻的来,挥一挥衣袖,不带走一片云彩";
		System.out.println(str.charAt(2));
		String arr[]=str.split(",");
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println(str.replace("轻轻", "重重"));
		System.out.println(str1.startsWith("a"));
		System.out.println(str4.substring(2));
		System.out.println(str1.toLowerCase());
		System.out.println(str4.toUpperCase());
		
	}
}
