package day25.thread;

public class Demo1_Thread extends Thread{
	/**
	 * 线程的几种状态
	 * */
	@Override
	public void run() {
		System.out.println("王者不可阻挡");
		System.out.println("线程是否是存活"+this.isAlive());
		System.out.println("run方法中的状态"+Thread.currentThread().getState());
	}
	public static void main(String[] args) throws InterruptedException {
		Demo1_Thread demo1=new Demo1_Thread();
		System.out.println("创建线程后的状态"+demo1.getState());
		System.out.println("线程是否是存活"+demo1.isAlive());
		demo1.start();
		System.out.println("开启线程后的状态"+demo1.getState());
		System.out.println("线程是否是存活"+demo1.isAlive());
		Thread.sleep(2000);
		System.out.println("线程结束后的状态"+demo1.getState());
		System.out.println("线程是否是存活"+demo1.isAlive());
	}
}
