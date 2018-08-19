package day25.thread;

import day08.ThisDemo;

public class Demo2_Thread extends Thread{
	/**
	 * �߳����ȼ�
	 * */
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(this.getName()+"��ǰ�̵߳����ȼ�"+this.getPriority());
		}
	}
	private String name;
	
	public Demo2_Thread(String name) {
		super(name);
	}

	public static void main(String[] args) {
		//�����̣߳�����������
		Demo2_Thread demo1=new Demo2_Thread("A");
		Demo2_Thread demo2=new Demo2_Thread("B");
		Demo2_Thread demo3=new Demo2_Thread("C");
		
		//�����߳����ȼ�
		demo1.setPriority(MAX_PRIORITY);
		demo2.setPriority(MIN_PRIORITY);
		
		//�����߳�
		demo1.start();
		demo2.start();
		demo3.start();
	}
}
