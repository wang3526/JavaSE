package day18.map;

import java.util.HashMap;

import day18.bean.Student;

public class Demo4_HashMap {
	/**
	 * * A:������ʾ
			* HashMap���ϼ���Studentֵ��String�İ���
			* ����ѧ�����󣬴���ÿһ��ѧ��
			* ֵ���ַ������󣬴���ѧ��������
	 * */
	public static void main(String[] args) {
		HashMap<Student, String> hm=new HashMap<Student, String>();
		hm.put(new Student("����", 23), "����");
		hm.put(new Student("����", 23), "�Ϻ�");
		hm.put(new Student("����", 25), "����");
		hm.put(new Student("����", 26), "����");
		
		System.out.println(hm);
	}
}