package day25.reflect;

import day25.bean.Person;

public class Demo1_Reflect {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1=Class.forName("day25.bean.Person");
		Class clazz2=Person.class;
		
		Person p=new Person();
		Class clazz3=p.getClass();
		
		System.out.println(clazz1==clazz2);
		System.out.println(clazz2==clazz3);
	}
}
