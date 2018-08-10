package day19.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import day18.bean.BaseStudent;
import day18.bean.Student;

public class Demo2_Generic {
	/**
	 * ���͹̶��±߽�
	 * * ? super E    --��������ø������͵ķ���
	 * 
	 * ���͹̶��ϱ߽�
	 * ? extends E    --����Ŀ��Լ��뵽������
	 * */
	public static void main(String[] args) {
		//demo1();
		TreeSet<Student> ts1=new TreeSet<Student>(new CompareByAge());
		ts1.add(new Student("����", 33));
		ts1.add(new Student("����", 13));
		ts1.add(new Student("����", 23));
		ts1.add(new Student("����", 43));
		
		TreeSet<BaseStudent> ts2=new TreeSet<BaseStudent>(new CompareByAge());
		ts2.add(new BaseStudent("����", 33));
		ts2.add(new BaseStudent("����", 13));
		ts2.add(new BaseStudent("����", 23));
		ts2.add(new BaseStudent("����", 43));
		System.out.println(ts2);
		
	}

	private static void demo1() {
		ArrayList<Student> list1=new ArrayList<Student>();
		list1.add(new Student("����", 23));
		list1.add(new Student("����", 24));
		
		ArrayList<BaseStudent> list2=new ArrayList<BaseStudent>();
		list2.add(new BaseStudent("����", 23));
		list2.add(new BaseStudent("����", 24));
		
		list1.addAll(list2);
	}
}

class CompareByAge implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		int num=o1.getAge()-o2.getAge();//������Ϊ��Ҫ����
		return num==0?o1.getName().compareTo(o2.getName()):num;
	}
}
