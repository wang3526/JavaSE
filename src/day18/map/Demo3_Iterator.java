package day18.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
	/**
	 * Map���ϵĵڶ��ֵ��������ݼ�ֵ�Զ��󣬻�ȡ����ֵ
	 * * A:��ֵ�Զ����Ҽ���ֵ˼·��
			* ��ȡ���м�ֵ�Զ���ļ���
			* ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
			* ���ݼ�ֵ�Զ����Ҽ���ֵ
	 * */
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		//Map.Entry˵��Entry��Map���ڲ��ӿڣ�������ֵ��װ����Entry���󣬲��洢��Set����
		/*Set<Map.Entry<String,Integer>> netrySet=map.entrySet();
		//��ȡÿһ������
		Iterator<Map.Entry<String, Integer>> it=netrySet.iterator();
		while(it.hasNext()){
			//��ȡÿһ��Entry����
			Map.Entry<String, Integer> entry=it.next();//��������ָ���������
			//Entry<String, Integer> entry=it.next();//ֱ�ӻ�ȡ�����������
			String key=entry.getKey();//���ݼ�ֵ�Զ����ȡ��
			Integer value=entry.getValue();//���ݼ�ֵ�Զ����ȡֵ
			System.out.println(key+"="+value);
		}*/
		
		for(Entry<String, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}
}
