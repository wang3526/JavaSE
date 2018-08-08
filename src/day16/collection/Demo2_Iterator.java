package day16.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day08.Student.Student;

public class Demo2_Iterator {
	/**
	 * ����
	 * * A:����������
		* �����������洢Ԫ��,�洢��Ԫ����Ҫ�鿴,��ô����Ҫ����(����) 
	 * */
	public static void main(String[] args) {
		//demo1();
		Collection c=new ArrayList();
		c.add(new Student("����",23)); //Object obj=new Student("����",23);
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		c.add(new Student("����",26));
		
		//��ȡ������
		Iterator it=c.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			Student s=(Student)it.next();
			System.out.println(s.getName()+" "+s.getAge());
		}
	}

	private static void demo1() {
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//�Լ����е�Ԫ�ص�����������
		Iterator it=c.iterator(); //��ȡ������
	/*	boolean b=it.hasNext(); //�жϼ������Ƿ���Ԫ�أ��з���true
		Object obj=it.next();
		System.out.println(b);
		System.out.println(obj);
		
		boolean b1=it.hasNext(); //�жϼ������Ƿ���Ԫ�أ��з���true
		Object obj1=it.next();
		System.out.println(b1);
		System.out.println(obj1);*/
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
