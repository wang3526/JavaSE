package day24.thread;

public class Demo2_Runnable {
	/**
	 * 通过实现Runnable接口创建线程
	 * */
	public static void main(String[] args) {
		//获取当前线程
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		//创建子线程对象
		Thread thread=new Thread(new MyRunnable());
		thread.start();
		System.out.println("执行完毕");
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		Thread thread=Thread.currentThread();
		thread.setName("小乔");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.getName()+"是大乔的妹妹");
	}
}
