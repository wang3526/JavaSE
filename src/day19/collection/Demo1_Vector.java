package day19.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo1_Vector {
	/**
	 * Vector ����
	 * 1���ײ�ʵ��������
	 * 2��ʵ����list�ӿ�
	 * 3��list�ӿڣ�����ģ������ظ���������nullֵ
	 * 4����ͬ���ģ��̰߳�ȫ������Ч�ʵ�
	 * */
	public static void main(String[] args) {
		//1����ʼ��һ��Vector����
		Vector<String> v=new Vector<String>();
		//2���������
		v.add("С��");
		v.add("����");
		v.add("���");
		v.add("���");
		v.add("����");
		
		//��ָ��λ�����Ԫ��
		v.add(2, "������");
		
		//�������е�Ԫ����ӵ���ǰ������
		Vector<String> v1=new Vector<String>();
		v1.add("����");
		v1.add("�����");
		v.addAll(v1);
		v.addElement("����");
		
		//�޸�Ԫ��
		v.set(2, "�ŷ�");//�޸�ָ��λ�õ�Ԫ��
		v.setElementAt("����", 4);
		
		//��ѯ
		System.out.println(v.get(0));
		System.out.println("�������ݷ��ص�һ�γ��ֵ�������"+v.indexOf("����"));
		System.out.println("�����е�һ��Ԫ�أ�"+v.firstElement());
		System.out.println("���һ��Ԫ�أ�"+v.lastElement());
		
		//ɾ��Ԫ��
		v.remove(1); //�����±�
		v.remove("����");
		v.removeElementAt(0);
		
		System.out.println();
		//��������
		for (String string : v) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		System.out.println(v);
		//��ȡ����������
		Iterator<String> it=v.iterator();
		while(it.hasNext()){//�ж��Ƿ���Ԫ��
			String str=it.next();//ȡ����һ��Ԫ��
			if(str==null)continue;
			if(str.equals("���")){
				it.remove();//ɾ����ǰָ��ָ��Ķ���
			}
		}
		System.out.println(v);
	}
}
