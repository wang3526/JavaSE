package day24.thread;

public class Demo3_EatApple3 {
	private static int AppleCount=50;
	public static void main(String[] args) {
		//创建线程，使用匿名内部类
		new Thread(new Runnable() {
			public void run() {			//重写run方法
				while(AppleCount>0){    //循环判断是否还有苹果
					System.out.println("小A吃了一个苹果，当前剩余："+AppleCount--+"个苹果");
				}
			}
		}).start();  //启动线程
		
		new Thread(new Runnable() {
			public void run() {
				while(AppleCount>0){
					System.out.println("小B吃了一个苹果，当前剩余："+AppleCount--+"个苹果");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				while(AppleCount>0){
					System.out.println("小C吃了一个苹果，当前剩余："+AppleCount--+"个苹果");
				}
			}
		}).start();
	}
}

