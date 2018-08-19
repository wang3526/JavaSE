package day25.thread;

import day08.ThisDemo;

public class Demo2_Thread extends Thread{
	/**
	 * 线程优先级
	 * */
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(this.getName()+"当前线程的优先级"+this.getPriority());
		}
	}
	private String name;
	
	public Demo2_Thread(String name) {
		super(name);
	}

	public static void main(String[] args) {
		//创建线程，并设置名称
		Demo2_Thread demo1=new Demo2_Thread("A");
		Demo2_Thread demo2=new Demo2_Thread("B");
		Demo2_Thread demo3=new Demo2_Thread("C");
		
		//设置线程优先级
		demo1.setPriority(MAX_PRIORITY);
		demo2.setPriority(MIN_PRIORITY);
		
		//启动线程
		demo1.start();
		demo2.start();
		demo3.start();
	}
}
