package day24.thread;

public class Demo3_EatApple1 extends Thread{
	static int count=50;
	@Override
	public void run() {
		while(count>0){
			System.out.println(this.currentThread().getName()+"����һ��ƻ������ʣ"+--count+"��");
		}
	}
	public static void main(String[] args) {
		Demo3_EatApple1 apple1=new Demo3_EatApple1();
		apple1.setName("СA");
		apple1.start();
		Demo3_EatApple1 apple2=new Demo3_EatApple1();
		apple2.setName("СB");
		apple2.start();
		Demo3_EatApple1 apple3=new Demo3_EatApple1();
		apple3.setName("СC");
		apple3.start();
		
	}
}
