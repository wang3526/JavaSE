package day14.innerclass;

public class Demo2_InnerCalss {
	String name;
	static int number;
	public void methodA(){
		System.out.println("�ⲿ��ʵ������");
	}
	public static void methodB(){
		System.out.println("�ⲿ�ྲ̬����");
	}
	/**
	 * ��̬�ڲ���
	 * 	λ��:���з�����
	 * 	���Σ�final abstract static private public protected
	 * 	��Ա�������Ǿ�̬�ͷǾ�̬
	 * 	
	 * */
	
	static class Inner{
		String name;
		static int age; 
		public Inner(){
			
		}
		
		public void methodA(){
			System.out.println("�ڲ���ʵ������");
			//��̬�ڲ����ʵ����Ա���Է����ⲿ��ľ�̬��Ա
			number=112;
			name="mars";//�ڲ����Ա
			//Demo2_InnerCalss.this.name="С��";//����������ⲿ���ʵ����Ա
		}
		public static void methodB(){
			//ֻ�ܷ��ʾ�̬��Ա
			System.out.println("�ڲ���ľ�̬����");
		}
	}
	
	public static void main(String[] args) {
		//��ʼ����̬�ڲ���,û�г�ʼ���ⲿ��
		Demo2_InnerCalss.Inner inner=new Demo2_InnerCalss.Inner();
		//�����ڲ����Ա�����Է������г�Ա
		inner.methodA();//�ڲ���ʵ������
		inner.methodB();//�ڲ��ྲ̬����
		
		//ֱ�ӷ����ڲ��ྲ̬��Ա,��������
		Demo2_InnerCalss.Inner.age=11;
		Demo2_InnerCalss.Inner.methodB();
		
		//�ڲ�������ⲿ���Ա��ֻ�ܷ��ʾ�̬��Ա
		
	}
}
