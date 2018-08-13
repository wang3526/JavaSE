package day21.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_HashMap {
	/**
	 * HashMap
	 * 1、无序
	 * 2、数据以键值对的方式进行存储
	 * 3、可以允许有一个key为null的成员
	 * */
	public static void main(String[] args) {
		//初始化一个HashMap对象
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//添加数据
		hm.put(1, "小乔");
		hm.put(3, "周瑜");
		hm.put(2, "大乔");
		hm.put(null, "李白");
		hm.put(4, "孙策");
		
		System.out.println(hm);
		
		//修改元素
		hm.put(null, "诸葛亮");
		System.out.println(hm);
		
		//删除元素
		hm.remove(null);  //通过key删除value
		System.out.println(hm);
		
		//查看成员
		String name=hm.get(1);//通过key获取value
		System.out.println(name);
		
		System.out.println(hm.containsKey(2));//判断是否包含指定的key
		System.out.println(hm.containsValue("大乔"));//判断是否包含指定的value
		System.out.println(hm.size());//获取键值对个数
		
		Set<Integer> key=hm.keySet();//获取所有key值
		System.out.println(key);
		
		Collection<String> value=hm.values();//获取所有value值
		System.out.println(value);
		
		//获取所有的映射关系，遍历Map
		Set<Map.Entry<Integer, String>> en=hm.entrySet();
		for (Map.Entry<Integer, String> entry : en) {
			System.out.print(entry.getKey()+" ");//获取所有的key值
			System.out.println(entry.getValue());//获取所有的value值
		}
	}
}
