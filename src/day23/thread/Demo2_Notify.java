package day23.thread;

public class Demo2_Notify {
	/**
	 * 等待唤醒机制
	 * */
	public static void main(String[] args) {
		final Printer p=new Printer();
		
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
	}
}

//等待唤醒机制
class Printer{
	private int flag=1;
	public void print1() throws InterruptedException{//同步方法只需要在方法上加synchronized关键字
		synchronized (this) {
			if(flag!=1){
				this.wait();  //当前线程等待
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag=2;
			this.notify();//随机唤醒单个等待的线程
		}
			
	}
		
	public void print2() throws InterruptedException{
		synchronized(this){        //锁对象不能用匿名对象，因为匿名对象不是同一个对象
			if(flag!=2){
				this.wait();
			}
			System.out.print("鲁");
			System.out.print("班");
			System.out.print("\r\n");
			flag=1;
			this.notify();
		}
	}
}
