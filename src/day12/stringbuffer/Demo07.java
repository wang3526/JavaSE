package day12.stringbuffer;

import javax.swing.text.ChangedCharSetException;

/**
 * * A:��ʽ��������
	* String��Ϊ��������
	* StringBuffer��Ϊ�������� 
* B:������ʾ
	* String��StringBuffer�ֱ���Ϊ������������
	* 
	* �����������͵�ֵ����   ���ı���ֵ
	* �����������͵�ֵ����   �ı���ֵ
	* 
	* String����Ȼ�������������ͣ�������������������ʱ�ͻ�������������һ����
 * */
public class Demo07 {
	public static void main(String[] args) {
		String s="heima";
		System.out.println(s);
		change(s);
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer();
		sb.append("heima");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
	}

	public static void change(StringBuffer sb) {
		sb.append("itcast");
		
	}

	public static void change(String s) {
		s+="itcast";
		
	}
}
