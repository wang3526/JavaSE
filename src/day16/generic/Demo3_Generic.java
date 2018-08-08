package day16.generic;

import java.util.ArrayList;
import java.util.List;

import day16.arraylist.Person;
import day16.arraylist.Student;


public class Demo3_Generic {
	/**
	 * * A:����ͨ���<?>
			* �������ͣ����û����ȷ����ô����Object�Լ������Java����
		* B:? extends E
			* �����޶���E��������
		* C:? super E
			* �����޶���E���丸��
	 * */
	public static void main(String[] args) {
		//List<?> list=new ArrayList<String>();//���ұߵķ����ǲ�ȷ��ʱ����߿������ʺ�
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person("����", 23));
		list.add(new Person("����", 24));
		list.add(new Person("����", 25));
		
		ArrayList<Student> list2=new ArrayList<>();
		list2.add(new Student("����", 26));
		list2.add(new Student("����", 27));
		
		list.addAll(list2);
		System.out.println(list);
	}
}
