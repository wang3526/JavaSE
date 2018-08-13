package day21.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo_TreeMap {
	/**
	 * TreeMap
	 * 1�����ݼ�ֵ�Զ�����
	 * 2��key������Ϊnull
	 * */
	public static void main(String[] args) {
		//��ʼ��һ��TreeMap����
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		//�������
		tm.put(3, "С��");
		tm.put(5, "����");
		tm.put(1, "���");
		tm.put(2, "���");
		
		System.out.println(tm);
		
		//ȡ��Ԫ��
		Map.Entry<Integer, String> en=tm.firstEntry();
		System.out.println(en.getKey()+"="+en.getValue());
		
		//��ȡ����Ԫ��
		Set<Map.Entry<Integer, String>> sen=tm.entrySet();
		//��������set��Ա
		for (Map.Entry<Integer, String> entry : sen) {
			System.out.print(entry.getKey()+" ");//��ȡ���е�keyֵ
			System.out.println(entry.getValue());//��ȡ���е�valueֵ
		}
		
		//��ȡһ��С�ڵ��ڵ�ǰ��ֵ��һ����ֵ��
		Map.Entry<Integer, String> en1=tm.floorEntry(4);
		System.out.println(en1.getKey());
		
	}
}
