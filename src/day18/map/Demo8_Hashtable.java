package day18.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo8_Hashtable {
	/**
	 * ������
	 * HashMap��Hashtable����
	 * ��ͬ�㣺
	 * �ײ㶼�ǹ�ϣ�㷨������˫�м���
	 * ����
	 * 1��HashMap���̲߳���ȫ�ģ�Ч�ʸߣ�JDK1.2�汾
	 * 	  Hashtable���̰߳�ȫ�ģ�Ч�ʵͣ�JDK1.0�汾
	 * 2��HashMap���Դ洢null����nullֵ
	 * 	  Hashtable�����Դ洢null����nullֵ
	 * */
	public static void main(String[] args) {
		/*HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put(null, 23);
		hm.put("����", null);
		System.out.println(hm);*/
		
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		//ht.put(null, 23);
		ht.put("����", null);
		System.out.println(ht);
		
	}
}
