package day21.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_HashMap {
	/**
	 * HashMap
	 * 1������
	 * 2�������Լ�ֵ�Եķ�ʽ���д洢
	 * 3������������һ��keyΪnull�ĳ�Ա
	 * */
	public static void main(String[] args) {
		//��ʼ��һ��HashMap����
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//�������
		hm.put(1, "С��");
		hm.put(3, "���");
		hm.put(2, "����");
		hm.put(null, "���");
		hm.put(4, "���");
		
		System.out.println(hm);
		
		//�޸�Ԫ��
		hm.put(null, "�����");
		System.out.println(hm);
		
		//ɾ��Ԫ��
		hm.remove(null);  //ͨ��keyɾ��value
		System.out.println(hm);
		
		//�鿴��Ա
		String name=hm.get(1);//ͨ��key��ȡvalue
		System.out.println(name);
		
		System.out.println(hm.containsKey(2));//�ж��Ƿ����ָ����key
		System.out.println(hm.containsValue("����"));//�ж��Ƿ����ָ����value
		System.out.println(hm.size());//��ȡ��ֵ�Ը���
		
		Set<Integer> key=hm.keySet();//��ȡ����keyֵ
		System.out.println(key);
		
		Collection<String> value=hm.values();//��ȡ����valueֵ
		System.out.println(value);
		
		//��ȡ���е�ӳ���ϵ������Map
		Set<Map.Entry<Integer, String>> en=hm.entrySet();
		for (Map.Entry<Integer, String> entry : en) {
			System.out.print(entry.getKey()+" ");//��ȡ���е�keyֵ
			System.out.println(entry.getValue());//��ȡ���е�valueֵ
		}
	}
}
