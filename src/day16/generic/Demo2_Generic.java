package day16.generic;

import java.util.ArrayList;
import java.util.Iterator;

import day16.arraylist.Person;

public class Demo2_Generic {
	/**
	 * * A:������ʾ
			* ArrayList�洢�ַ������������Ͱ�
	 * */
	public static void main(String[] args) {
		//demo1();
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person("����", 23));
		list.add(new Person("����", 24));
		list.add(new Person("����", 25));
		list.add(new Person("����", 26));
		
		Iterator<Person> it=list.iterator();
		while(it.hasNext()){
			Person p=it.next();  //�������е�ÿһ��Ԫ����Person��¼
			System.out.println(p.getName()+" "+p.getAge());
		}
	}

	private static void demo1() {
		ArrayList<String> list=new ArrayList<String>();//�������϶���
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//list.add(1);
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}