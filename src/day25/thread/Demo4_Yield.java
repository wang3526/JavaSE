package day25.thread;

public class Demo4_Yield implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			if(i==3){
				System.out.println("aaaaaaaaaa");
				Thread.currentThread().yield();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	public static void main(String[] args) {
		Demo4_Yield yield=new Demo4_Yield();
		
		new Thread(yield,"小草").start();
		new Thread(yield,"小花").start();
		new Thread(yield,"小树").start();
		
	}
	
}
