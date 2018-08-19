package day25.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import day25.bean.Person;

public class Demo5_Method {
	/**
	 * * Method
	 	* Class.getMethod(String, Class...) �� 
	 	* Class.getDeclaredMethod(String, Class...)�������Ի�ȡ���е�ָ������,
	 	* ����invoke(Object, Object...)���Ե��ø÷���,Class.getMethod("eat") 
	 	* invoke(obj) Class.getMethod("eat",int.class) invoke(obj,10)
	 * @throws Exception 

	 * */
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("day25.bean.Person");
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p=(Person)c.newInstance("����",23);
		
		Method m=clazz.getMethod("eat");   //��ȡeat����
		m.invoke(p);
		
		Method m2=clazz.getMethod("eat", int.class);  //��ȡ�вε�eat����
		m2.invoke(p, 10);
		
	}
}
