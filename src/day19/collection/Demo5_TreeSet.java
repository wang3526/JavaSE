package day19.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo5_TreeSet {
	/**
	 * TreeSet
	 * 1、不允许有null
	 * 2、不允许有重复值
	 * 3、添加的顺序是无序的
	 * 4、内容可以排序
	 * */
	public static void main(String[] args) {
		//初始化TreeSet对象
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(3);
		ts.add(9);
		ts.add(6);
		ts.add(7);
		System.out.println(ts);
		//查看
		System.out.println(ts.contains(3));//是否包含指定对象
		System.out.println(ts.isEmpty());//判断是否是空集合
		System.out.println(ts.last());//获取最后一个元素
		System.out.println(ts.first());//获取第一个元素
		System.out.println(ts.lower(4));//返回小于等于该值的最大元素
		System.out.println(ts.higher(8));//返回大于等于该值的最小元素
		
		//删除
		ts.remove(6);
		System.out.println(ts.pollFirst());//获取删除第一个元素
		System.out.println(ts.pollLast());//获取删除最后一个元素
		System.out.println(ts);
		
		//获取所有元素
		for (Integer integer : ts) {
			System.out.print(integer+" ");
		}
		
		//迭代器
		for(Iterator<Integer> it=ts.iterator();it.hasNext();){
			System.out.print(it.next()+" ");
		}
		
	}
}
