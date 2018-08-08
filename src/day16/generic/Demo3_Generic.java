package day16.generic;

import java.util.ArrayList;
import java.util.List;

import day16.arraylist.Person;
import day16.arraylist.Student;


public class Demo3_Generic {
	/**
	 * * A:泛型通配符<?>
			* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
		* B:? extends E
			* 向下限定，E及其子类
		* C:? super E
			* 向上限定，E及其父类
	 * */
	public static void main(String[] args) {
		//List<?> list=new ArrayList<String>();//当右边的泛型是不确定时，左边可以是问号
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("王五", 25));
		
		ArrayList<Student> list2=new ArrayList<>();
		list2.add(new Student("赵六", 26));
		list2.add(new Student("周七", 27));
		
		list.addAll(list2);
		System.out.println(list);
	}
}
