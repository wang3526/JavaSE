package day25.reflect;

import java.lang.reflect.Constructor;

import day25.bean.Person;

public class Demo3_Constructor {
	/**
	 * * Constructor
	* Class���newInstance()������ʹ�ø����޲εĹ��캯����������, ���һ����û���޲εĹ��캯��, 
	* �Ͳ�������������,���Ե���Class���getConstructor(String.class,int.class)����
	* ��ȡһ��ָ���Ĺ��캯��Ȼ���ٵ���Constructor���newInstance("����",20)������������
	 * @throws Exception 
	 * */
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("day25.bean.Person");
		//Person p=(Person)clazz.newInstance();//ͨ���޲ι��촴������
		//System.out.println(p);
		
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p=(Person)c.newInstance("����",23);
		System.out.println(p);
	}
}
