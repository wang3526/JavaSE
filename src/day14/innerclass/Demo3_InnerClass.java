package day14.innerclass;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class Demo3_InnerClass {
	String name;
	static String sex;
	public void methodA(){
		System.out.println("�ⲿ��ʵ������");
	}
	
	/**
	 * �ֲ��ڲ���
	 * λ�ã�������
	 * ��Ա�����붼��ʵ����Ա
	 * ֻ���������ķ�����ʹ��
	 * */
	public void methodB(){
		int num=10;
		class Inner{
			String name;
			int age;
			
			public void methodC(){
				//�ֲ��ڲ�����Է����ⲿ������г�Ա
				System.out.println(sex);
				//�����ⲿ�࣬�����ڵľֲ�����,�ֲ������������final���η���JDK1.8֮����Ҫ���
				System.out.println(num);
				System.out.println("�ֲ��ڲ���ʵ������");
			}
			
			/*public static void methodD(){
				System.out.println("�ֲ��ڲ���ľ�̬����");
			}*/
		}
		//��ʼ���ڲ������
		Inner inner=new Inner();
		//���ʳ�Ա
		inner.name="mars";
		inner.age=12;
		inner.methodC();
	}
	
	public static void main(String[] args) {
		//��ʼ���ⲿ�����
		Demo3_InnerClass di=new Demo3_InnerClass();
		di.methodB();
	}
	
	
	
	
}
