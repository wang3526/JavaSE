package day22.syn;

public class Demo2_Synchronized {
	/**
	 * ͬ�������
	 * */
	public static void main(String[] args) {
		final Print1 p=new Print1();
			
			
		new Thread(){
			public void run(){
				while(true){
					p.print1();
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					p.print2();
				}
			}
		}.start();
	}
}

class Print1{
	Demo1 demo=new Demo1();
	//�Ǿ�̬��ͬ����������������ʲô��
	//�𣺷Ǿ�̬��ͬ����������������this
	//��̬��ͬ����������������ʲô��
	//�Ǹ�����ֽ������
	public static synchronized void print1(){//ͬ������ֻ��Ҫ�ڷ����ϼ�synchronized�ؼ���
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
	}
		
	public static void print2(){
		//synchronized(new Demo()){
		synchronized(Print1.class){        //��������������������Ϊ����������ͬһ������
			System.out.print("³");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
}

class Demo1{
		
}

