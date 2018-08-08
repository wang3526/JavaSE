package day16.list;

import java.util.ArrayList;
import java.util.List;

public class Demo_List {
	/**
	 * * A:List集合的特有功能概述
			* void add(int index,E element)
			* E remove(int index)
			* E get(int index)
			* E set(int index,E element)
	 * */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		List list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(1, "c");//将指定位置的元素修改
		System.out.println(list);
	}

	private static void demo4() {
		List list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//Object obj1=list.get(2);
		//System.out.println(obj1);
		//通过索引遍历list集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void demo3() {
		List list=new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		
		list.remove(111); //删除的时候不会自动装箱，把111当作索引
		System.out.println(list);
	}

	private static void demo2() {
		List list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj=list.remove(1);//通过索引删除集合中的元素
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo1() {
		List list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(4, "f");//index<=size并且index>=0都不会报异常
		//list.add(1, "e");
		//list.add(10, "c");//java.lang.IndexOutOfBoundsException
		System.out.println(list);
	}
}
