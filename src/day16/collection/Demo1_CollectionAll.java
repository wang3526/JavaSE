package day16.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1_CollectionAll {
	/**
	 * * A:������ʾ
			��All�Ĺ�����ʾ
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
		//ȡ������������õļ��ϸı�ͷ���true��������õļ��ϲ���ͷ���false
		boolean b=c.retainAll(c1); //ȡ����
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
		
		boolean b=c.containsAll(c1);//�жϵ��õļ����Ƿ��������ļ���
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
		
		boolean b=c1.removeAll(c1); //ɾ�����ǽ���
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Collection c1=new ArrayList();  //alt + shift +r����
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		//c.addAll(c1);    //��c1�е�ÿһ��Ԫ����ӵ�c��
		c.add(c1);   //��c1����һ��������ӵ�c��
		System.out.println(c);
	}
}
