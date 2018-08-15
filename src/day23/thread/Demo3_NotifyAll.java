package day23.thread;

public class Demo3_NotifyAll {
	public static void main(String[] args) {
		final Printer2 p=new Printer2();
		
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

/**
 * 1、在同步代码块中，用哪个对象锁就用哪个对象调用wait方法
 * 2、为什么wait和notify这些方法需要定义在Object这个类中？
 * 锁对象可以是任意对象，那么任意对象对应的类都是Object的子类，也就是Object是所有类的基类，
 * 所以讲方法定义在Object这个类中就会让任意对象对其进行调用
 * 3、sleep方法和wait方法的区别
 * a、sleep方法在同步代码块中或同步方法中，不释放锁（睡着了也会抱着锁睡）
 * 	  wait方法在同步代码块中或同步方法中，释放锁
 * b、sleep方法必须传入参数，参数其实就是时间，时间到了，自动醒来
 * 	  wait方法可以传入参数也可以不传入参数
 * 		如果给wait方法传入时间参数，用法与sleep相似，时间到就停止等待（通常用的是无参数的wait方法）
 * */
class Printer2{
	private int flag=1;
	public void print1() throws InterruptedException{//同步方法只需要在方法上加synchronized关键字
		synchronized (this) {
			while(flag!=1){
				this.wait();  //当前线程等待
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag=2;
			//this.notify();
			this.notifyAll();//随机唤醒单个等待的线程
		}
			
	}
		
	public void print2() throws InterruptedException{
		synchronized(this){        //锁对象不能用匿名对象，因为匿名对象不是同一个对象
			while(flag!=2){
				this.wait();       //线程2在此等待
			}
			System.out.print("鲁");
			System.out.print("班");
			System.out.print("\r\n");
			flag=3;
			//this.notify();
			this.notifyAll();
		}
	}
	
	public void print3() throws InterruptedException{
		synchronized(this){        //锁对象不能用匿名对象，因为匿名对象不是同一个对象
			while(flag!=3){        //线程3在此等待，if语句是在哪里等待，就在哪里起来
				this.wait();       //while循环是循环判断，每次都会判断标记
			}
			System.out.print("h");
			System.out.print("e");
			System.out.print("l");
			System.out.print("l");
			System.out.print("o");
			System.out.print("\r\n");
			flag=1;
			//this.notify();
			this.notifyAll();            //1.5之前解决方案
		}
	}
}