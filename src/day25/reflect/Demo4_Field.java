package day25.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import day25.bean.Person;

public class Demo4_Field {
	/**
	 * * Field
	 	* Class.getField(String)方法可以获取类中的指定字段(可见的), 如果是私有的
	 	* 可以用getDeclaedField("name")方法获取,通过set(obj, "李四")方法可以
	 	* 设置指定对象上该字段的值, 如果是私有的需要先调用setAccessible(true)设置访问权限,
	 	* 用获取的指定的字段调用get(obj)可以获取指定对象中该字段的值
	 * @throws Exception 
	 * */
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("day25.bean.Person");
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p=(Person)c.newInstance("张三",23);
		
		//Field f=clazz.getField("name");   //获取姓名字段   因为是私有的
		//f.set(p, "李四");                  //修改姓名的值 
		
		Field f=clazz.getDeclaredField("name");  //暴力反射，获取字段
		f.setAccessible(true);     //去除私有权限
		f.set(p, "李四");
		System.out.println(p);
	}
}
