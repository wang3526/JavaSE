package day22.syn;

public class Demo1_Synchronized {
	/**
	 * ͬ�������
	 * */
	public static void main(String[] args) {
		final Print p=new Print();
		
		
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

class Print{
	Demo demo=new Demo();
	public void print1(){
		//synchronized(new Demo()){
		synchronized(demo){        //ͬ������飬�����ƣ��������������
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
		}
	}
	
	public void print2(){
		//synchronized(new Demo()){
		synchronized(demo){        //��������������������Ϊ����������ͬһ������
			System.out.print("³");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
}

class Demo{
	
}