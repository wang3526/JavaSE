package day24.thread;

import day08.ThisDemo;

public class Demo3_EatApple2 implements Runnable{
	int count=50;
	@Override
	public void run() {
		while(count>0){
			System.out.println(Thread.currentThread().getName()+"吃了一个苹果，还剩"+--count+"个");
		}
	}
	
	public static void main(String[] args) {
		Demo3_EatApple2 apple2 =new Demo3_EatApple2();
		Thread tA=new Thread(apple2, "小A");
		Thread tB=new Thread(apple2, "小B");
		Thread tC=new Thread(apple2, "小C");
		tA.start();
		tB.start();
		tC.start();
	}
}
