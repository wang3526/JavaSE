package day24.thread;

public class Demo2_Runnable {
	/**
	 * ͨ��ʵ��Runnable�ӿڴ����߳�
	 * */
	public static void main(String[] args) {
		//��ȡ��ǰ�߳�
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		//�������̶߳���
		Thread thread=new Thread(new MyRunnable());
		thread.start();
		System.out.println("ִ�����");
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		Thread thread=Thread.currentThread();
		thread.setName("С��");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.getName()+"�Ǵ��ǵ�����");
	}
}
