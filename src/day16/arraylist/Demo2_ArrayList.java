package day16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_ArrayList {
	/**
		* A:������ʾ
			* ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ(����ĳ�Ա����ֵ��ͬ)
		* B:ע������
			* ��дequals()������
			* 
		contains�����ж��Ƿ�������ײ���������equals����
		remove�������ײ���������equals����
	 * */
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Person("����", 23));
		list.add(new Person("����", 23));
		list.add(new Person("����", 24));
		list.add(new Person("����", 24));
		list.add(new Person("����", 24));
		list.add(new Person("����", 24));
		
		//ArrayList newList=getSingle(list);
		//System.out.println(newList);
		list.remove(new Person("����", 23));
		System.out.println(list);
	}
	
	/*
	 * �����¼��Ͻ��ظ�Ԫ��ȥ��
	 * 1����ȷ����ֵ���ͣ�����ArrayList
	 * 2����ȷ�����б�ArrayList
	 * 
	 * ����
	 * 1�������¼���
	 * 2�����ݴ���ļ��ϻ�ȡ������
	 * 3�������ϼ���
	 * 4��ͨ���¼����ж��Ƿ�����ϼ����е�Ԫ�أ����������
	 * */
	
	public static ArrayList getSingle(ArrayList list){
		ArrayList newList=new ArrayList();
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();//��¼ÿһ��Ԫ��
			if(!newList.contains(obj)){//����¼����в������ϼ����е�Ԫ�أ����
				newList.add(obj);
			}
		}
		return newList;
	}
}
