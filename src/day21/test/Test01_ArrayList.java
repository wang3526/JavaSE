package day21.test;

import java.util.ArrayList;

public class Test01_ArrayList {
	/**
	 * ����˵��
		�洢��������Ϣ����ȡ��������������ӡ����������Ϣ 
		ɾ��ָ��λ�õĹ������һ����
		ɾ��ָ���Ĺ�
		�жϼ������Ƿ����ָ����
		
		ArrayList
	 * */
	public static void main(String[] args) {
		//����ArrayList����
		ArrayList<Dog> list=new ArrayList<Dog>();
		//���С��
		Dog dog1=new Dog("ŷŷ", "ѩ����");
		list.add(dog1);
		Dog dog2=new Dog("����", "��������");
		list.add(dog2);
		Dog dog3=new Dog("�Ʒ�", "��������");
		list.add(dog3);
		Dog dog4=new Dog("����", "ѩ����");
		list.add(dog4);
		
		//�洢��������Ϣ����ȡ��������������ӡ����������Ϣ 
		System.out.println("������"+list.size()+"������");
		System.out.println("�ֱ��ǣ�");
		for (Dog dog : list) {
			System.out.println(dog);
		}
		
		System.out.println("ɾ��֮ǰ������"+list.size()+"������");
		//ɾ��ָ��λ�õĹ������һ����
		list.remove(0);
		
		//ɾ��ָ���Ĺ�
		list.remove(dog3);
		System.out.println("ɾ��֮����"+list.size()+"������");
		for (Dog dog : list) {
			System.out.println(dog);
		}
		
		//�жϼ������Ƿ����ָ����
		if(list.contains(dog4))
			System.out.println("�����а���"+dog4.getName()+"����Ϣ");
		else
			System.out.println("�����в�����"+dog4.getName()+"����Ϣ");
	}
}

class Dog{
	private String name;
	private String breed;
	public Dog() {
		super();
	}
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return name+"	"+breed;
	}
}
