package day16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_ArrayList {
	/**
		* A:案例演示
			* 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
		* B:注意事项
			* 重写equals()方法的
			* 
		contains方法判断是否包含，底层依赖的是equals方法
		remove方法，底层依赖的是equals方法
	 * */
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Person("张三", 23));
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		
		//ArrayList newList=getSingle(list);
		//System.out.println(newList);
		list.remove(new Person("张三", 23));
		System.out.println(list);
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
