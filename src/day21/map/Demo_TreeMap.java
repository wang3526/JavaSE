package day21.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo_TreeMap {
	/**
	 * TreeMap
	 * 1、根据键值自动排序
	 * 2、key不允许为null
	 * */
	public static void main(String[] args) {
		//初始化一个TreeMap对象
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		//添加数据
		tm.put(3, "小乔");
		tm.put(5, "大乔");
		tm.put(1, "周瑜");
		tm.put(2, "孙策");
		
		System.out.println(tm);
		
		//取出元素
		Map.Entry<Integer, String> en=tm.firstEntry();
		System.out.println(en.getKey()+"="+en.getValue());
		
		//获取所有元素
		Set<Map.Entry<Integer, String>> sen=tm.entrySet();
		//遍历所有set成员
		for (Map.Entry<Integer, String> entry : sen) {
			System.out.print(entry.getKey()+" ");//获取所有的key值
			System.out.println(entry.getValue());//获取所有的value值
		}
		
		//获取一个小于等于当前键值的一个键值对
		Map.Entry<Integer, String> en1=tm.floorEntry(4);
		System.out.println(en1.getKey());
		
	}
}
