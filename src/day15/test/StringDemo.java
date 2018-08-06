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
		System.out.println(str3.compareTo(str4));//�Ƚ������ַ��������ֵ�˳��
		System.out.println(str2.compareToIgnoreCase(str3));//�Ƚ������ַ����������ִ�Сд
		System.out.println(str4.concat("ef"));//���ַ�����β��׷���ַ���
		System.out.println(str4.contains("aa"));//�鿴�Ƿ����Ӵ�
		System.out.println(str4.endsWith("d"));
		System.out.println(str1.equals(str4));
		System.out.println(str4.indexOf('a'));
		System.out.println(str4.lastIndexOf("b"));
		System.out.println("".isEmpty());
		System.out.println(str1.length());
		String str="�����������,�������������,��һ������,������һƬ�Ʋ�";
		System.out.println(str.charAt(2));
		String arr[]=str.split(",");
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println(str.replace("����", "����"));
		System.out.println(str1.startsWith("a"));
		System.out.println(str4.substring(2));
		System.out.println(str1.toLowerCase());
		System.out.println(str4.toUpperCase());
		
	}
}
