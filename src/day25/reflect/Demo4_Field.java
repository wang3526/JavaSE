package day25.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import day25.bean.Person;

public class Demo4_Field {
	/**
	 * * Field
	 	* Class.getField(String)�������Ի�ȡ���е�ָ���ֶ�(�ɼ���), �����˽�е�
	 	* ������getDeclaedField("name")������ȡ,ͨ��set(obj, "����")��������
	 	* ����ָ�������ϸ��ֶε�ֵ, �����˽�е���Ҫ�ȵ���setAccessible(true)���÷���Ȩ��,
	 	* �û�ȡ��ָ�����ֶε���get(obj)���Ի�ȡָ�������и��ֶε�ֵ
	 * @throws Exception 
	 * */
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("day25.bean.Person");
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p=(Person)c.newInstance("����",23);
		
		//Field f=clazz.getField("name");   //��ȡ�����ֶ�   ��Ϊ��˽�е�
		//f.set(p, "����");                  //�޸�������ֵ 
		
		Field f=clazz.getDeclaredField("name");  //�������䣬��ȡ�ֶ�
		f.setAccessible(true);     //ȥ��˽��Ȩ��
		f.set(p, "����");
		System.out.println(p);
	}
}
