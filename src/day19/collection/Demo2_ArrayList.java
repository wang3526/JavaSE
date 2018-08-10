package day19.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demo2_ArrayList {
	/**
	 * ArrayList 
	 * 1、底层用数组实现
	 * 2、有序的
	 * 3、可以允许重复元素
	 * 4、允许有null
	 * 5、不支持同步
	 * */
	public static void main(String[] args) {
		//1、初始化一个ArrayList对象
		ArrayList<String> list=new ArrayList<String>();
		//添加元素
		list.add("小乔");//在尾部添加
		list.add("大乔");
		list.add("周瑜");
		list.add("孙策");
		System.out.println(list);
		//指定位置添加
		list.add(2, "孙尚香");
		System.out.println(list);
		
		//修改
		list.set(1, "安琪拉");//修改指定位置的元素
		
		//删除
		//list.remove(1); //删除指定位置的元素
		//list.remove("孙策");//删除列表中首次出现的元素
		Vector<String> v=new Vector<String>();
		v.add("小乔");
		v.add("李四");
		list.removeAll(v);//删除集合中所有相等的元素，删除交集
		//list.clear();//删除集合中所有的元素
		System.out.println(list);
		//查询
		System.out.println(list.get(1));//通过下标查找
		System.out.println(list.indexOf("孙尚香"));//查找元素第一次出现的索引
		System.out.println(list.lastIndexOf("孙尚香"));//查找元素最后一次出现的索引
		System.out.println(list.contains("孙策"));//集合中是否包含指定元素
		
		//获取所有元素
		//方式一
		for (String string : list) {
			System.out.print(string+" ");
		}
		
		System.out.println();
		//方式二
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		//方式三-迭代器  有缺点，不能遍历的时候修改，并发修改异常
		Iterator<String> it=list.iterator();//获取迭代器对象
		while(it.hasNext()){
			String str=it.next();
			//list.remove("周瑜");//ConcurrentModificationException
			if(str==null)continue;
			if(str.equals("周瑜")){
				it.remove();
			}
		}
		System.out.println(list);
		
		//方式四-使用List特有迭代器
		ListIterator<String> lt=list.listIterator();
		while(lt.hasNext()){
			String str=lt.next();
			if(str!=null){
				if(str.equals("安琪拉"))
					lt.remove();
			}
			
		}
		System.out.println(list);
	}
}
