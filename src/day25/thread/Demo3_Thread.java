package day25.thread;

public class Demo3_Thread extends Thread{
	@Override
	public void run() {
		
		try {
			System.out.println("七夕");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("快乐");
	}
	public static void main(String[] args) throws InterruptedException {
		Demo3_Thread demo1=new Demo3_Thread();
		demo1.start();
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(200);
			if(i==3){
				demo1.join();      //加入线程
			}
			System.out.println("aaaaaaaa");
		}
	}
}
