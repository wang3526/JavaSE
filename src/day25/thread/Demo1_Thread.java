package day25.thread;

public class Demo1_Thread extends Thread{
	/**
	 * �̵߳ļ���״̬
	 * */
	@Override
	public void run() {
		System.out.println("���߲����赲");
		System.out.println("�߳��Ƿ��Ǵ��"+this.isAlive());
		System.out.println("run�����е�״̬"+Thread.currentThread().getState());
	}
	public static void main(String[] args) throws InterruptedException {
		Demo1_Thread demo1=new Demo1_Thread();
		System.out.println("�����̺߳��״̬"+demo1.getState());
		System.out.println("�߳��Ƿ��Ǵ��"+demo1.isAlive());
		demo1.start();
		System.out.println("�����̺߳��״̬"+demo1.getState());
		System.out.println("�߳��Ƿ��Ǵ��"+demo1.isAlive());
		Thread.sleep(2000);
		System.out.println("�߳̽������״̬"+demo1.getState());
		System.out.println("�߳��Ƿ��Ǵ��"+demo1.isAlive());
	}
}
