package day19.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo1_Vector {
	/**
	 * Vector 向量
	 * 1、底层实现是数组
	 * 2、实现了list接口
	 * 3、list接口，有序的，可以重复，可以有null值
	 * 4、是同步的，线程安全，但是效率低
	 * */
	public static void main(String[] args) {
		//1、初始化一个Vector对象
		Vector<String> v=new Vector<String>();
		//2、添加数据
		v.add("小乔");
		v.add("大乔");
		v.add("周瑜");
		v.add("孙策");
		v.add("黄忠");
		
		//在指定位置添加元素
		v.add(2, "孙尚香");
		
		//将集合中的元素添加到当前集合中
		Vector<String> v1=new Vector<String>();
		v1.add("刘禅");
		v1.add("诸葛亮");
		v.addAll(v1);
		v.addElement("关羽");
		
		//修改元素
		v.set(2, "张飞");//修改指定位置的元素
		v.setElementAt("刘备", 4);
		
		//查询
		System.out.println(v.get(0));
		System.out.println("根据内容返回第一次出现的索引："+v.indexOf("刘备"));
		System.out.println("集合中第一个元素："+v.firstElement());
		System.out.println("最后一个元素："+v.lastElement());
		
		//删除元素
		v.remove(1); //根据下标
		v.remove("关羽");
		v.removeElementAt(0);
		
		System.out.println();
		//遍历集合
		for (String string : v) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		System.out.println(v);
		//获取迭代器对象
		Iterator<String> it=v.iterator();
		while(it.hasNext()){//判断是否还有元素
			String str=it.next();//取出下一个元素
			if(str==null)continue;
			if(str.equals("周瑜")){
				it.remove();//删除当前指针指向的对象
			}
		}
		System.out.println(v);
	}
}
