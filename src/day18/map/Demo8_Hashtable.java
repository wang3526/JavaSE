package day18.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo8_Hashtable {
	/**
	 * 面试题
	 * HashMap和Hashtable区别
	 * 共同点：
	 * 底层都是哈希算法，都是双列集合
	 * 区别：
	 * 1、HashMap是线程不安全的，效率高，JDK1.2版本
	 * 	  Hashtable是线程安全的，效率低，JDK1.0版本
	 * 2、HashMap可以存储null键和null值
	 * 	  Hashtable不可以存储null键和null值
	 * */
	public static void main(String[] args) {
		/*HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put(null, 23);
		hm.put("李四", null);
		System.out.println(hm);*/
		
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		//ht.put(null, 23);
		ht.put("张三", null);
		System.out.println(ht);
		
	}
}
