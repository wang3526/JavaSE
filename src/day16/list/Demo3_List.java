package day16.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {
	/**
	 * * A:������ʾ
			* ��������һ�����ϣ����ʣ������ж�������û��"world"���Ԫ�أ�
			* ����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�
	 * */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("a");  //Object obj=new String("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
	/*	Iterator it=list.iterator();//��ȡ������
		while(it.hasNext()){//�жϼ����Ƿ���Ԫ��
			String str=(String)it.next();
			if("world".equals(str)){
				list.add("javaee");//������ͬʱ����Ԫ�أ����������޸� java.util.ConcurrentModificationException
			}
		}*/
		
		ListIterator lit=list.listIterator();//��ȡ��������List�������еģ�
		while(lit.hasNext()){
			String str=(String)lit.next();
			if("world".equals(str)){
				//list.add("javaee");
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}
}
