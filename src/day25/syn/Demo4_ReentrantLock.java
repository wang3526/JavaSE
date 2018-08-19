package day25.syn;

import java.util.concurrent.locks.ReentrantLock;

public class Demo4_ReentrantLock implements Runnable{
	private int count=50;
	//创建一个锁对象
	ReentrantLock r=new ReentrantLock();
	
	@Override
	public void run() {
		while(true){
			for(int i=0;i<50;i++){
				 r.lock(); //上锁
				if(count>0){
					count--;
					System.out.println(Thread.currentThread().getName()+"吃了一个苹果，还剩"+count+"个苹果");
				}
				r.unlock();   //解锁
			}
		}
	}
	public static void main(String[] args) {
		Demo4_ReentrantLock d1=new Demo4_ReentrantLock();
		new Thread(d1, "小A").start();
		new Thread(d1, "小B").start();
	}
}
