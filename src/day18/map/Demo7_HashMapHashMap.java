package day18.map;

import java.util.HashMap;

import day18.bean.Student;

public class Demo7_HashMapHashMap {
	/**
	 * * A:������ʾ
			* ����Ƕ��֮HashMapǶ��HashMap
		����
		˫Ԫ�����кܶ������
		��88�ڻ����ඨ���һ��˫�м��ϣ�����ѧ������ֵ��ѧ�������ء�
		��99�ڻ����ඨ���һ��˫�м��ϣ�����ѧ������ֵ��ѧ�������ء�
		
		����88�ڻ���99�ڶ��ǰ༶��������Ϊ�˷���ͳһ��������Щ�༶������ӵ�˫Ԫ���ü�����
	 * */
	public static void main(String[] args) {
		//����88�ڻ�����
		HashMap<Student, String> hm88=new HashMap<Student, String>();
		hm88.put(new Student("����", 23), "����");
		hm88.put(new Student("����", 24), "����");
		hm88.put(new Student("����", 25), "�Ϻ�");
		hm88.put(new Student("����", 26), "����");
		
		//����99�ڻ�����
		HashMap<Student, String> hm99=new HashMap<Student, String>();
		hm99.put(new Student("����", 20), "����");
		hm99.put(new Student("С��", 19), "����");
		hm99.put(new Student("���", 22), "�Ϻ�");
		hm99.put(new Student("���", 24), "����");
		
		//����˫Ԫ����
		HashMap<HashMap<Student, String>, String> hm=new HashMap<HashMap<Student,String>, String>();
		hm.put(hm88, "��88�ڻ�����");
		hm.put(hm99, "��99�ڻ�����");
		
		//˫�м��ϱ���
		for(HashMap<Student, String> h:hm.keySet()){//hm.keySet()����˫�м����м��ļ���
			String value=hm.get(h);//get(h)���ݼ�ֵ��ȡֵ����
			//��������˫�м��϶���
			for(Student key:h.keySet()){//h.keySet()��ȡ����������ѧ��������
				String value2=h.get(key);
				System.out.println(key+"="+value2+"="+value);
			}
		}
	}
}
