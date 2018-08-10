package day19.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demo2_ArrayList {
	/**
	 * ArrayList 
	 * 1���ײ�������ʵ��
	 * 2�������
	 * 3�����������ظ�Ԫ��
	 * 4��������null
	 * 5����֧��ͬ��
	 * */
	public static void main(String[] args) {
		//1����ʼ��һ��ArrayList����
		ArrayList<String> list=new ArrayList<String>();
		//���Ԫ��
		list.add("С��");//��β�����
		list.add("����");
		list.add("���");
		list.add("���");
		System.out.println(list);
		//ָ��λ�����
		list.add(2, "������");
		System.out.println(list);
		
		//�޸�
		list.set(1, "������");//�޸�ָ��λ�õ�Ԫ��
		
		//ɾ��
		//list.remove(1); //ɾ��ָ��λ�õ�Ԫ��
		//list.remove("���");//ɾ���б����״γ��ֵ�Ԫ��
		Vector<String> v=new Vector<String>();
		v.add("С��");
		v.add("����");
		list.removeAll(v);//ɾ��������������ȵ�Ԫ�أ�ɾ������
		//list.clear();//ɾ�����������е�Ԫ��
		System.out.println(list);
		//��ѯ
		System.out.println(list.get(1));//ͨ���±����
		System.out.println(list.indexOf("������"));//����Ԫ�ص�һ�γ��ֵ�����
		System.out.println(list.lastIndexOf("������"));//����Ԫ�����һ�γ��ֵ�����
		System.out.println(list.contains("���"));//�������Ƿ����ָ��Ԫ��
		
		//��ȡ����Ԫ��
		//��ʽһ
		for (String string : list) {
			System.out.print(string+" ");
		}
		
		System.out.println();
		//��ʽ��
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		//��ʽ��-������  ��ȱ�㣬���ܱ�����ʱ���޸ģ������޸��쳣
		Iterator<String> it=list.iterator();//��ȡ����������
		while(it.hasNext()){
			String str=it.next();
			//list.remove("���");//ConcurrentModificationException
			if(str==null)continue;
			if(str.equals("���")){
				it.remove();
			}
		}
		System.out.println(list);
		
		//��ʽ��-ʹ��List���е�����
		ListIterator<String> lt=list.listIterator();
		while(lt.hasNext()){
			String str=lt.next();
			if(str!=null){
				if(str.equals("������"))
					lt.remove();
			}
			
		}
		System.out.println(list);
	}
}
