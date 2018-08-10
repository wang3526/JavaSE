package day19.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo5_TreeSet {
	/**
	 * TreeSet
	 * 1����������null
	 * 2�����������ظ�ֵ
	 * 3����ӵ�˳���������
	 * 4�����ݿ�������
	 * */
	public static void main(String[] args) {
		//��ʼ��TreeSet����
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(3);
		ts.add(9);
		ts.add(6);
		ts.add(7);
		System.out.println(ts);
		//�鿴
		System.out.println(ts.contains(3));//�Ƿ����ָ������
		System.out.println(ts.isEmpty());//�ж��Ƿ��ǿռ���
		System.out.println(ts.last());//��ȡ���һ��Ԫ��
		System.out.println(ts.first());//��ȡ��һ��Ԫ��
		System.out.println(ts.lower(4));//����С�ڵ��ڸ�ֵ�����Ԫ��
		System.out.println(ts.higher(8));//���ش��ڵ��ڸ�ֵ����СԪ��
		
		//ɾ��
		ts.remove(6);
		System.out.println(ts.pollFirst());//��ȡɾ����һ��Ԫ��
		System.out.println(ts.pollLast());//��ȡɾ�����һ��Ԫ��
		System.out.println(ts);
		
		//��ȡ����Ԫ��
		for (Integer integer : ts) {
			System.out.print(integer+" ");
		}
		
		//������
		for(Iterator<Integer> it=ts.iterator();it.hasNext();){
			System.out.print(it.next()+" ");
		}
		
	}
}
