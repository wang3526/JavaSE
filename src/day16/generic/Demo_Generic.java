package day16.generic;

import java.util.ArrayList;
import java.util.Iterator;

import day16.arraylist.Person;

public class Demo_Generic {
	/**
	 * * A:���͸���
		* B:���ͺô�
			* ��߰�ȫ��(�������ڵĴ���ת����������) 
			* ʡȥǿת���鷳
		* C:���ͻ���ʹ��
			* <>�зŵı����������������� 
		* D:����ʹ��ע������
			* ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���)  
	 * */
	public static void main(String[] args) {
		//demo();
		//int[] arr=new byte[5];//����Ҫ��֤ǰ�����������һ��
		//ArrayList<Object> list=new ArrayList<Person>();//���ϵķ���Ҫ��֤ǰ����������һ��
		//ArrayList<Object> list=new ArrayList<>();//1.7�汾�������ԣ����η���
		ArrayList<Object> list=new ArrayList<Object>();//������ò�Ҫ�����Object��û������
		list.add("aaa");
		list.add(true);
	}

	private static void demo() {
		ArrayList<Person> list=new ArrayList<Person>();
		//list.add(110);
		//list.add(true);
		list.add(new Person("����",23));
		list.add(new Person("����", 24));
		
		Iterator<Person> it=list.iterator();
		while (it.hasNext()) {
			//System.out.println(it.next());
			
			//next����ֻ�ܵ���һ�Σ�������ö�λὫָ������ƶ����
			//System.out.println(it.next().getName()+" "+it.next().getAge());
			Person p=it.next();//����ת��
			System.out.println(p.getName()+" "+p.getAge());
		}
	}
}
