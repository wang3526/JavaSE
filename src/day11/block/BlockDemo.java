package day11.block;
/**
 * �����
 * ���ࣺ
 * 		1���ֲ������
 * 		2����ʼ�������
 * 		3����������
 * 		4����̬�����
 * */
public class BlockDemo {
	//�ֲ������
	public void methodA(){
		System.out.println("�ֲ�����飬���ö��ٴΣ�ִ�ж��ٴ�");
	}
	public static void methodB(){
		System.out.println("�ֲ�����飬���ö��ٴΣ�ִ�ж��ٴ�");
	}
	//��ʼ�������
	{
		System.out.println("��ʼ������飬�����ڹ������飬�������ٴζ���ִ�ж��ٴ�");
	}
	//��������
	public BlockDemo(){
		System.out.println("�������飬�������ٴζ���ִ�ж��ٴ�");
	}
	//��̬�����
	static{
		System.out.println("��̬����飬������ؽ�JVMʱ��ִ�У���ִֻ��һ��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockDemo bDemo=new BlockDemo();
		bDemo.methodA();
		BlockDemo bDemo2=new BlockDemo();
	}

}
