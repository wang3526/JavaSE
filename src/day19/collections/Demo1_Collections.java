package day19.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {
	/**
	 * * A:Collections类概述
			* 针对集合操作 的工具类
		* B:Collections成员方法
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
		
		//System.out.println(Collections.max(list));//根据默认排序结果获取集合中的最大值
		//Collections.reverse(list);//反转集合
		Collections.shuffle(list);//随机置换，可以用来洗牌
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
		Collections.sort(list);//将集合排序
		System.out.println(list);
	}
}
