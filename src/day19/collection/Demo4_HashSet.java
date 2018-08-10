package day19.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Demo4_HashSet {
	/**
	 * HashSet �ص�
	 * 1��Ԫ���������
	 * 2�����������ظ�ֵ
	 * 3��ֻ����һ��null
	 * 4����֧��ͬ��
	 * */
	public static void main(String[] args) {
		//����HashSet����
		HashSet<String> hs=new HashSet<String>();
		hs.add("С��");
		hs.add("����");
		hs.add("���");
		hs.add("���");
		hs.add("С��");
		hs.add(null);
		
		System.out.println(hs);
		//ɾ��Ԫ��
		hs.remove(null);
		//hs.clear();
		System.out.println(hs);
		
		//�鿴Ԫ��
		System.out.println(hs.contains("С��"));
		System.out.println(hs.size());//��ȡ����
		System.out.println(hs.isEmpty());
		//�鿴����Ԫ��
		for (String string : hs) {
			System.out.print(string+" ");
		}
		System.out.println();
		//��ȡ������
		Iterator<String> it=hs.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
			//�������ɾ������ʹ�õ������е�remove����
			it.remove();
		}
		System.out.println();
		System.out.println(hs);
	}
}
