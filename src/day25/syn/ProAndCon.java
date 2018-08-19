package day25.syn;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProAndCon{
	/**
	 * 生产者、消费者问题
	 * 生产者生产包子、消费者吃包子、共享资源包子
	 * */
	public static void main(String[] args) {
		ShareResource sr=new ShareResource();
		Producer p=new Producer(sr);
		Consumer c=new Consumer(sr);
		p.start();
		c.start();
		
		
		
	
	}
}

//共享资源---包子
class ShareResource{	
	ReentrantLock reen=new ReentrantLock();//创建锁对象
	Condition c1=reen.newCondition();      //
	Condition c2=reen.newCondition();
	int count=0; //包子数量
}

//生产者
class Producer extends Thread{
	private ShareResource resource;   //共享资源对象
	
	public Producer() {               //无参构造

	}

	public Producer(ShareResource resource) {   //有参构造
		this.resource = resource;
	}
	
	@Override
	public void run() {                         //重写run方法
			while(true){
				try {
					add();
					Thread.sleep((int)(Math.random()*500));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
	public void add() throws InterruptedException{      //生产包子
		resource.reen.lock();            //加锁
		if(resource.count==20){          //判断包子数是否等于20
			resource.c1.await();         //是，等待
		}
		resource.count++;            //是，生产包子
		System.out.println("生产了一个包子包子数"+resource.count);
			
		if(resource.count>10){           //判断包子数是否大于10
			resource.c2.signal();        //唤醒消费者
		}
		resource.reen.unlock();          //解锁
	}
}

//消费者
class Consumer extends Thread{
	private ShareResource resource;  //共享资源对象

	public Consumer() {				 //无参构造
		
	}

	public Consumer(ShareResource resource) {   //有参构造
		this.resource = resource;
	}
	
	public void delete() throws InterruptedException{
		resource.reen.lock();			//加锁
			if(resource.count==0){		//判断包子数是否等于0
				resource.c2.await();	//是，等待
			}
			if(resource.count>5){		//判断包子数是否大于5
				resource.count--;		//吃包子
				System.out.println("吃了一个包子包子数还剩"+resource.count);
			}
			if(resource.count<=5){		//判断包子是否小于等于10
				resource.c1.signal();   //是，唤醒生产者
			}
		resource.reen.unlock();         //解锁
	}
	
	@Override
	public void run() {
			while(true){
				try {
					delete();
					Thread.sleep((int)(Math.random()*500));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
}