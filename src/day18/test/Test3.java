package day18.test;

import java.util.HashMap;

public class Test3 {
	/**
	 * * A:������ʾ
			* ����ͳ���ַ�����ÿ���ַ����ֵĴ���
		������
		1������һ����Ҫͳ���ַ����ַ���
		2�����ַ���ת�����ַ�����
		3������˫�м��ϣ��洢�ַ������ַ��Լ��ַ����ֵĴ���
		4�������ַ������ȡÿһ���ַ��������ַ��洢��˫�м�����
		5���洢������Ҫ���жϣ���������в�������������ͽ����ַ���������ֵΪ1�洢
		����������а�����������ͽ�ֵ��1�洢
		6����ӡ˫�м��ϻ�ȡ�ַ����ֵĴ���
	 * */
	public static void main(String[] args) {
		//1������һ����Ҫͳ���ַ����ַ���
		String str="aaaaaaabbbbbbcccccccc";
		//2�����ַ���ת�����ַ�����
		char[] arr=str.toCharArray();
		//3������˫�м��ϣ��洢�ַ������ַ��Լ��ַ����ֵĴ���
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		//4�������ַ������ȡÿһ���ַ��������ַ��洢��˫�м�����
		for (char c : arr) {
			//5���洢������Ҫ���жϣ���������в�������������ͽ����ַ���������ֵΪ1�洢
			//����������а�����������ͽ�ֵ��1�洢
			/*if(!hm.containsKey(c)){//��������������
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);
			}*/
			hm.put(c, !hm.containsKey(c)?1:hm.get(c)+1);
		}
		//6����ӡ˫�м��ϻ�ȡ�ַ����ֵĴ���
		for (Character key : hm.keySet()) {//hm.keySet()�������м��ļ���
			System.out.println(key+"="+hm.get(key));//hm.get(key)���ݼ���ȡֵ
		}
		
	}
}
