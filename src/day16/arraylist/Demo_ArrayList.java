package day16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Demo_ArrayList {
	/**
	 **  A:案例演示
	 		* 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
	 		* 思路：创建新集合方式
	 * */
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		ArrayList newList=getSingle(list);
		System.out.println(newList);
		
	}
	
	/*
	 * 创建新集合将重复元素去掉
	 * 1、明确返回值类型，返回ArrayList
	 * 2、明确参数列表ArrayList
	 * 
	 * 分析
	 * 1、创建新集合
	 * 2、根据传入的集合获取迭代器
	 * 3、遍历老集合
	 * 4、通过新集合判断是否包含老集合中的元素，不包含添加
	 * */
	
	public static ArrayList getSingle(ArrayList list){
		ArrayList newList=new ArrayList();
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();//记录每一个元素
			if(!newList.contains(obj)){//如果新集合中不包含老集合中的元素，添加
				newList.add(obj);
			}
		}
		return newList;
	}
	
}
