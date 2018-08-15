package day23.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo4_ReentrantLock {
	public static void main(String[] args) {
		final Printer3 p=new Printer3();
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}

class Printer3{
	private ReentrantLock r=new ReentrantLock();
	private Condition c1=r.newCondition();     //1.5特性
	private Condition c2=r.newCondition();
	private Condition c3=r.newCondition();
	private int flag=1;
	public void print1() throws InterruptedException{//同步方法只需要在方法上加synchronized关键字
		r.lock();  //获取锁
			if(flag!=1){
				c1.await();  
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag=2;
			c2.signal();
		r.unlock();  //释放锁
			
	}
		
	public void print2() throws InterruptedException{
		r.lock();   
			if(flag!=2){
				c2.await();
			}
			System.out.print("鲁");
			System.out.print("班");
			System.out.print("\r\n");
			flag=3;
			c3.signal();
		r.unlock();
	}
	
	public void print3() throws InterruptedException{
		r.lock();
			if(flag!=3){        //线程3在此等待，if语句是在哪里等待，就在哪里起来
				c3.await();
			}
			System.out.print("h");
			System.out.print("e");
			System.out.print("l");
			System.out.print("l");
			System.out.print("o");
			System.out.print("\r\n");
			flag=1;
			c1.signal();  
		r.unlock();
	}
}