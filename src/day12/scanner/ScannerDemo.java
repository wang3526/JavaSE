package day12.scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
/*		System.out.println("�������һ������:");
		int i=sc.nextInt();
		System.out.println("������ڶ���������");
		int j=sc.nextInt();
		System.out.println("i="+i+"j="+j);*/
		
	/*	System.out.println("�������һ���ַ�����");
		String line1=sc.nextLine();
		System.out.println("������ڶ����ַ�����");
		String line2=sc.nextLine();
		System.out.println("line1="+line1+" line2="+line2);*/
		
		/**
		 * nextInt()�Ǽ���¼�������ķ�����������¼��10��ʱ��
		 * ��ʵ�ڼ�����¼�����10��\r\n��nextInt()����ֻ��ȡ10�ͽ�����
		 * nextLine()�Ǽ���¼���ַ����ķ��������Խ����������ͣ�
		 * ͨ��\r\n��ֻҪ����\r\n��֤��һ�н�����
		 * */
	/*	System.out.println("�������һ������:");
		int i=sc.nextInt();
		System.out.println("�������һ���ַ�����");
		String line1=sc.nextLine();
		System.out.println("i="+i+" line1="+line1);*/
		
		/**
		 * �������
		 * 1���������ζ��󣬵����˷ѿռ�
		 * 2������¼��Ķ����ַ���������nextLine()���������潲�����ַ���װ���������ķ���
		 * */
 		int i=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		String line=sc2.nextLine();
		System.out.println(i);
		System.out.println(line);
		
		
	}
		
}
