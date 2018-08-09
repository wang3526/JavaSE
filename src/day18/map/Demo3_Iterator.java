package day18.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
	/**
	 * Map集合的第二种迭代，根据键值对对象，获取键和值
	 * * A:键值对对象找键和值思路：
			* 获取所有键值对对象的集合
			* 遍历键值对对象的集合，获取到每一个键值对对象
			* 根据键值对对象找键和值
	 * */
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		//Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合
		/*Set<Map.Entry<String,Integer>> netrySet=map.entrySet();
		//获取每一个对象
		Iterator<Map.Entry<String, Integer>> it=netrySet.iterator();
		while(it.hasNext()){
			//获取每一个Entry对象
			Map.Entry<String, Integer> entry=it.next();//父类引用指向子类对象
			//Entry<String, Integer> entry=it.next();//直接获取的是子类对象
			String key=entry.getKey();//根据键值对对象获取键
			Integer value=entry.getValue();//根据键值对对象获取值
			System.out.println(key+"="+value);
		}*/
		
		for(Entry<String, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}
}
