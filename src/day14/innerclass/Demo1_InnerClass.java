package day14.innerclass;
/**
 * �ڲ��ࣺ
 * 		������ڲ��ٶ���һ���࣬���Կ�����ĳ�Ա
 * ��ĳ�Ա��
 * 		�ֶΡ���������
 * �ڲ�����ࣺ
 * 		1��ʵ���ڲ���     
 * 		2����̬�ڲ���
 * 		3���ֲ��ڲ���
 * 		4�������ڲ���
 * @author Administrator
 *
 */
public class Demo1_InnerClass {
	//�ⲿ�������
	String name;    //ʵ����Ա
	static int age;       
	//�ⲿ��ķ���
	public void methodA(){
		System.out.println(name+"�ⲿ�෽��");
	}
	//����ʵ���ڲ���
	/**
	 * ʵ���ڲ���
	 * 	λ�ã����з�����
	 * 	����ʹ�õ����η���public private Ĭ�� protected
	 *	 ������static
	 *	
	 *	���ж���ĳ�Ա
	 *		����ʹ��static����
	 *		����Ȩ�����η�-������
	 *
	 *	�ڲ�������ⲿ���Ա
	 *		���ڲ����п���ֱ�ӷ����ⲿ��ĳ�Ա(ʵ���;�̬)
	 *		
	 * */
	class Inner{
		//�����ڲ���Ա
		String name;   //ʵ����Ա
		//ststic int age;  //����ʹ��static��������
		public void printmsg(){
			System.out.println(name+age+"ʵ���ڲ���ķ���");
		}
		
		public void printOutMsg(){
			//����ⲿ���Ա���ڲ����Աһ�£�Ĭ�Ϸ����ڲ����Ա
			//��������ⲿ���Ա
			System.out.println(Demo1_InnerClass.this.name);
			//������ڲ�������ⲿ�෽�����ⲿ������.this.������
			Demo1_InnerClass.this.methodA();
		}
		public void methodA(){
			System.out.println("�ڲ��෽��");
		}
		public Inner(){
			System.out.println("Inner���췽��");
		}
		public Inner(String name){
			this.name=name;
			Demo1_InnerClass.this.name=name;
		}
	}
	public static void main(String[] args) {
		//��ʼ���ⲿ��
		Demo1_InnerClass di=new Demo1_InnerClass();
		di.name="����";
		//��ʼ���ڲ������
		Inner inner=di.new Inner();
		//Inner inner=di.new Inner("С��");
		//���ڲ������Ը�ֵ
		inner.name="С��";
		//�����ڲ��෽��
		inner.printmsg();
		inner.printOutMsg();
		inner.methodA();
		//di.methodA();
	}
	
	
}
