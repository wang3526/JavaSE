package day12.string;

import java.util.Scanner;

/**
 * �ַ�����ת
 * 	����¼��"abc"
 * ������"cba"
 * 
 * ������
 * 1��ͨ������¼���ȡ�ַ���
 * 2�����ַ���ת�����ַ�����
 * 3�����ű����ַ����飬��ƴ�ӳ��ַ���
 * 4����ӡ
 * */
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();     //������¼����ַ����洢��line��
		char[] arr=line.toCharArray(); //���ַ���ת�����ַ�����
		String s="";
		for(int i=arr.length-1;i>=0;i--){
			s=s+arr[i];
		}
		System.out.println(s);
	}
}
