package day16.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1_CollectionAll {
	/**
	 * * A:案例演示
			带All的功能演示
			boolean addAll(Collection c)
			boolean removeAll(Collection c)
			boolean containsAll(Collection c)
			boolean retainAll(Collection c)
	 * */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Collection c1=new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("z");
		c1.add("c");
		c1.add("d");
		//取交集，如果调用的集合改变就返回true，如果调用的集合不变就返回false
		boolean b=c.retainAll(c1); //取交集
		System.out.println(b);
		System.out.println(c);
	}

	private static void demo3() {
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Collection c1=new ArrayList();
		c1.add("a");
		c1.add("b");
		//c1.add("b");
		c1.add("z");
		
		boolean b=c.containsAll(c1);//判断调用的集合是否包含传入的集合
		System.out.println(b);
	}

	private static void demo2() {
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Collection c1=new ArrayList();
		//c1.add("a");
		//c1.add("b");
		
		boolean b=c1.removeAll(c1); //删除的是交集
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Collection c1=new ArrayList();  //alt + shift +r改名
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		//c.addAll(c1);    //将c1中的每一个元素添加到c中
		c.add(c1);   //将c1看成一个对象添加到c中
		System.out.println(c);
	}
}
