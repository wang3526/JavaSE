package day25.thread;

public class Demo3_Thread extends Thread{
	@Override
	public void run() {
		
		try {
			System.out.println("��Ϧ");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����");
	}
	public static void main(String[] args) throws InterruptedException {
		Demo3_Thread demo1=new Demo3_Thread();
		demo1.start();
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(200);
			if(i==3){
				demo1.join();      //�����߳�
			}
			System.out.println("aaaaaaaa");
		}
	}
}
