package day19.collection;

import java.util.LinkedList;

public class Demo3_LinkedList {
	/**
	 * LinkedList
	 * 特点 Deque、List接口的特性
	 * 1、元素有序
	 * 2、元素可以有null
	 * 3、元素可以重复
	 * 4、底层是链表、双向链表
	 * 5、具有队列的特点和栈的特点
	 * 6、不支持同步
	 * */
	public static void main(String[] args) {
		//初始化LinkedList对象     空列表
		LinkedList<String> list=new LinkedList<String>();
		//增加数据
		list.add("小乔");
		list.add(0, "大乔");   //在链表的指定位置添加
		list.addFirst("周瑜"); //在链表的头部添加
		list.addLast("孙策");  //在链表的尾部添加
		list.push("孙尚香");   //压栈,头是栈顶
		//list.pop();           //出栈
		System.out.println(list);
		
		//修改数据
		list.set(2, "关羽");  
		
		//查询
		System.out.println(list.get(2));//取出指定位置的元素
		System.out.println(list.getFirst());//取出第一个元素
		System.out.println(list.getLast());//取出最后一个元素
		System.out.println(list.element());//取出第一个元素
		
		System.out.println(list.offer("张飞"));//在尾部添加元素
		System.out.println(list.offerFirst("刘备"));//在头部添加元素
		System.out.println(list.offerLast("刘禅"));//在尾部添加元素
		
		System.out.println(list.indexOf("张飞"));//元素首次出现的索引
		System.out.println(list);
		//删除数据
		/*System.out.println(list.poll());//取出head元素，并删除该元素
		System.out.println(list.pollFirst());//取出第一个元素，并删除
		System.out.println(list.pollLast());//取出最后一个元素，并删除
*/		list.remove();//删除头
		list.remove(2);//删除指定位置的元素
		list.remove("小乔");//删除首次出现的指定元素
		
		//遍历删除 必须使用迭代器
		
		
		
		System.out.println(list);
	}
}
