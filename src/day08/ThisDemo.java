package day08;

//class Operation{
//	//����һ�����󣬽������name��ֵ��ֵ������A�Ρ�
//	public static void setValue(ThisDemo demo){
//		demo.setName("����A��");
//	}
//}

public class ThisDemo {
	//���췽��֮�以��ʱ�򣬿���ʹ��
	//this([����])
	//���췽������
	public ThisDemo(){
		System.out.println("Ĭ��");
	}
	
	public ThisDemo(String name){
		this();
		System.out.println("һ������");
	}
	public ThisDemo(String name,int age){
		//���췽������ʱthis�������ұ����ڹ��췽���ĵ�һ��
		this("С��");
		System.out.println("��������");
	}
	
	
	
	/*
	//this ��Ϊ��������
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�Զ���һ������
	public void methodA(){
		//��ȡ��this,��this��Ϊ�������ݸ���һ������
		Operation.setValue(this);
	}


	*/


	/**
	//this ������Ϊ�����ķ���ֵ����ʽ��̣�
	public void methodA(){
		System.out.println("ȷ�Ϲ�����");
	}
	
	//����һ���������з���ֵ
	public ThisDemo methodB(){
		System.out.println("����");
		//����ǰ���󷵻�
		return this;
	}
	*/
	
	/*
	// this �ؼ��ֿ��Խ����Ա�����;ֲ�����������
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//�ֲ������ͳ�Ա�����Ķ�����
		this.name = name;
	}
	*/
	public static void main(String[] args) {
		//��ʼ��һ������
		//ThisDemo demo=new ThisDemo();//����Ĭ�Ϲ���
		//ThisDemo demo=new ThisDemo("С��");//����һ�������Ĺ���
		ThisDemo demo=new ThisDemo("С��",18);//�������������Ĺ���
		
		
		
		
		/*
		ThisDemo demo=new ThisDemo();
		demo.methodA();
		System.out.println(demo.getName());
		*/
		
		/**
		//��ʼ��һ������ThisDemo
		ThisDemo demo=new ThisDemo();
//		System.out.println("demo:"+demo);
		//���÷���
//		ThisDemo demo1=demo.methodB();
//		System.out.println("demo1:"+demo1);
		demo.methodB().methodA();  //��ʽ���
		*/
		
		/*
		ThisDemo demo = new ThisDemo();
		demo.setName("mars");
		System.out.println(demo.getName());
		*/
	}

}
