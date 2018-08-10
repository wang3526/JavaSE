package day19.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

import javax.lang.model.element.Element;

public class Test2 {
	/**
		* A:������ʾ
			* ģ�⶷����ϴ�ƺͷ��Ʋ����ƽ�������Ĵ���ʵ��
		
		������
		1����һ���˿ˣ���ʵ�����Լ�����һ�����϶��󣬽��˿��ƴ洢��ȥ
		2��ϴ��
		3������
		4������
	 * */
	public static void main(String[] args) {
		//1����һ���˿ˣ���ʵ�����Լ�����һ�����϶��󣬽��˿��ƴ洢��ȥ
		String[] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color={"����","����","��Ƭ","÷��"};
		HashMap<Integer, String> hm=new HashMap<Integer, String>();//�洢�������˿���
		ArrayList<Integer> list=new ArrayList<Integer>();//�洢����
		int index=0;
		
		//ƴ���˿��Ʋ����������˿��ƴ洢��hm
		for (String s1:num) {//��ȡ����
			for (String s2:color) {//��ȡԪ��
				hm.put(index, s2.concat(s1));
				list.add(index);//0-51��ӵ�list������
				index++;
			}
		}
		//��С����ӵ�˫�м�����
		hm.put(index, "С��");
		list.add(index);//��52������ӵ�������
		index++;
		hm.put(index, "����");
		list.add(index);//��53������ӵ�������
		
		//2��ϴ��
		Collections.shuffle(list);
		
		//3������
		TreeSet<Integer> gaojin=new TreeSet<Integer>();
		TreeSet<Integer> longwu=new TreeSet<Integer>();
		TreeSet<Integer> me=new TreeSet<Integer>();
		TreeSet<Integer> dipai=new TreeSet<Integer>();
		for(int i=0;i<list.size();i++){
			if(i>=list.size()-3){
				dipai.add(list.get(i));//�����ŵ��ƴ洢�ڵ��Ƽ�����
			}else if (i%3==0) {
				gaojin.add(list.get(i));
			}else if (i%3==1) {
				longwu.add(list.get(i));
			}else {
				me.add(list.get(i));
			}
		}
		
		//4������
		lookPoker(hm, gaojin, "�߽�");
		lookPoker(hm, longwu, "����");
		lookPoker(hm, me, "��");
		lookPoker(hm, dipai, "����");
	}
	
	/**
	 * ����
	 * 1������ֵ����void
	 * 2�������б�HashMap��TreeSet,String name
	 * */
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts,String name){
		System.out.print(name+"�����ǣ�");
		for(Integer i:ts){//i����˫�м����е�ÿһ����
			System.out.print(hm.get(i)+" ");//ͨ������ȡֵ
		}	
		System.out.println();
	}
}
