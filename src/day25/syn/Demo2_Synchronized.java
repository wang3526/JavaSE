package day25.syn;

public class Demo2_Synchronized implements Runnable{
	/**
	 * 同步代码块
	 * */
	int count=50;
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			synchronized (this) {
					if(count>0){
					count--;
					System.out.println(Thread.currentThread().getName()+"吃了一个苹果，还剩"+count+"个苹果");
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		Demo2_Synchronized syn=new Demo2_Synchronized();
		
		new Thread(syn, "小A").start();
		new Thread(syn, "小B").start();
		new Thread(syn, "小C").start();
	}
}
