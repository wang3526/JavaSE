package day19.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {
	/**
	 * * A:Collections�����
			* ��Լ��ϲ��� �Ĺ�����
		* B:Collections��Ա����
		* 
			public static <T> void sort(List<T> list)
			public static <T> int binarySearch(List<?> list,T key)
			public static <T> T max(Collection<?> coll)
			public static void reverse(List<?> list)
			public static void shuffle(List<?> list)
	 * */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("h");
		list.add("g");
		
		//System.out.println(Collections.max(list));//����Ĭ����������ȡ�����е����ֵ
		//Collections.reverse(list);//��ת����
		Collections.shuffle(list);//����û�����������ϴ��
		System.out.println(list);
	}

	private static void demo2() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("g");
		list.add("h");
		
		System.out.println(Collections.binarySearch(list, "c"));
		System.out.println(Collections.binarySearch(list, "b"));
	}

	private static void demo1() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("d");
		
		System.out.println(list);
		Collections.sort(list);//����������
		System.out.println(list);
	}
}
