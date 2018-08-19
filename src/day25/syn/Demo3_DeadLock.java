package day25.syn;

public class Demo3_DeadLock implements Runnable{
	/**
	 * 死锁
	 * */
	Object obj=new Object();
	boolean isFlag;
	
	@Override
	public void run() {
		if(!isFlag){
			isFlag=!isFlag;
			printA();
		}else {
			printB();
		}
	}
	
	public void printA(){
		System.out.println(Thread.currentThread().getName()+"开始执行---");
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+"执行，等待获取obj---");
			synchronized (obj) {
				System.out.println("获取到obj---");
			}
			System.out.println("obj获取完毕---");
		}
		System.out.println(Thread.currentThread().getName()+"执行完毕---");
	}
	
	public void printB(){
		System.out.println(Thread.currentThread().getName()+"开始执行");
		synchronized (obj) {
			System.out.println(Thread.currentThread().getName()+"执行，等待获取this");
			synchronized (this) {
				System.out.println("获取到this");
			}
			System.out.println("this获取完毕");
		}
		System.out.println(Thread.currentThread().getName()+"执行完毕");
	}
	public static void main(String[] args) {
		Demo3_DeadLock deadLock=new Demo3_DeadLock();
		
		new Thread(deadLock, "小A").start();
		new Thread(deadLock, "小B").start();
	}
}
