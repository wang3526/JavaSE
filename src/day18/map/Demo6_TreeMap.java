package day18.map;

import java.util.Comparator;
import java.util.TreeMap;

import day18.bean.Student;

public class Demo6_TreeMap {
	/**
	 * * A:������ʾ
			* TreeMap���ϼ���Studentֵ��String�İ���
	 * */
	public static void main(String[] args) {
		//demo1();
		TreeMap<Student, String> tm=new TreeMap<Student, String>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int num=o1.getName().compareTo(o2.getName());//���������Ƚ�
				return num==0?o1.getAge()-o2.getAge():num;
			}
		});
		tm.put(new Student("����", 23), "����");
		tm.put(new Student("����", 24), "�Ϻ�");
		tm.put(new Student("����", 25), "����");
		tm.put(new Student("����", 26), "����");
		
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student, String> tm=new TreeMap<Student, String>();
		tm.put(new Student("����", 23), "����");
		tm.put(new Student("����", 24), "�Ϻ�");
		tm.put(new Student("����", 25), "����");
		tm.put(new Student("����", 26), "����");
		
		System.out.println(tm);
	}
}
