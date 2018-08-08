package day16.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {
	/**
	 * * A:案例演示
			* 需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，
			* 如果有，我就添加一个"javaee"元素，请写代码实现。
	 * */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("a");  //Object obj=new String("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		
	/*	Iterator it=list.iterator();//获取迭代器
		while(it.hasNext()){//判断集合是否有元素
			String str=(String)it.next();
			if("world".equals(str)){
				list.add("javaee");//遍历的同时增加元素，叫做并发修改 java.util.ConcurrentModificationException
			}
		}*/
		
		ListIterator lit=list.listIterator();//获取迭代器（List集合特有的）
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
