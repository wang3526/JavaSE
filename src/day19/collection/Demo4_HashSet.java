package day19.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Demo4_HashSet {
	/**
	 * HashSet 特点
	 * 1、元素是无序的
	 * 2、不允许有重复值
	 * 3、只允许一个null
	 * 4、不支持同步
	 * */
	public static void main(String[] args) {
		//创建HashSet对象
		HashSet<String> hs=new HashSet<String>();
		hs.add("小乔");
		hs.add("大乔");
		hs.add("周瑜");
		hs.add("孙策");
		hs.add("小乔");
		hs.add(null);
		
		System.out.println(hs);
		//删除元素
		hs.remove(null);
		//hs.clear();
		System.out.println(hs);
		
		//查看元素
		System.out.println(hs.contains("小乔"));
		System.out.println(hs.size());//获取个数
		System.out.println(hs.isEmpty());
		//查看所有元素
		for (String string : hs) {
			System.out.print(string+" ");
		}
		System.out.println();
		//获取迭代器
		Iterator<String> it=hs.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
			//如果遍历删除必须使用迭代器中的remove方法
			it.remove();
		}
		System.out.println();
		System.out.println(hs);
	}
}
