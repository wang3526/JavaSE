package day16.arraylist;

import java.util.LinkedList;

public class Demo4_LinkedList {
	/**
	 * ��LinkedListģ��ջ�ṹ
	 * */
	public static void main(String[] args) {
		//demo();
		Stack s=new Stack();
		s.in("a");   //��ջ
		s.in("b");
		s.in("c");
		s.in("d");
		s.in("e");
		while(!s.isEmpty()){//�ж�ջ�ṹ�Ƿ�Ϊ��
			System.out.println(s.out());//��ջ
		}
	}

	private static void demo() {
		LinkedList list=new LinkedList();//�������϶���
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		list.addLast("e");
		
	/*	System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());*/
		
		/*while(!list.isEmpty()){
			System.out.println(list.removeLast());
		}*/
	}
}
