package day09.extendsdemo;

public class Demo1_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemothB demothB=new DemothB(18);
		//demothB.show();
	}

}

class DemothA{
	public DemothA(){
		System.out.println("�����޲ι���");
	}
	public DemothA(String name){
		System.out.println(name+"�вι���");
	}
	public void show(){
		System.out.println("Hello World��");
	}
}

class DemothB extends DemothA{
	public DemothB(){
		//super.show();  //���ø���ĳ�Ա����
		//super("С��");
		System.out.println("�����޲ι���");
	}
	
	public DemothB(int age){
		super();    //����һ����䣬�����д��ϵͳ��Ĭ�ϼ��ϣ��������ʸ����еĿղι��췽��
		System.out.println("�����вι���");
	}
	
	public void show(){
		System.out.println("fvfdsver");
	}
}
