package day24.thread;

public class Demo3_EatApple1 extends Thread{
	static int count=50;
	@Override
	public void run() {
		while(count>0){
			System.out.println(this.currentThread().getName()+"吃了一个苹果，还剩"+--count+"个");
		}
	}
	public static void main(String[] args) {
		Demo3_EatApple1 apple1=new Demo3_EatApple1();
		apple1.setName("小A");
		apple1.start();
		Demo3_EatApple1 apple2=new Demo3_EatApple1();
		apple2.setName("小B");
		apple2.start();
		Demo3_EatApple1 apple3=new Demo3_EatApple1();
		apple3.setName("小C");
		apple3.start();
		
	}
}
