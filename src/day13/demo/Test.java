package day13.demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str={"����","��ѧ","Ӣ��"};
		try{
			System.out.println("������1-3֮������֣�");
			int i=sc.nextInt();
			System.out.println(i+"��Ӧ�Ŀγ�Ϊ��"+str[i-1]);
		}catch(Exception e){
			System.out.println("�������");
		}finally{
			System.out.println("��ӭ������飡");
		}
	}
}
