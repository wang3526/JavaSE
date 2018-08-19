package day25.syn;

public class Demo1_Synchronized implements Runnable{
	/**
	 * Synchronized修饰符
	 * 可以修饰实例方法
	 * 可以修饰代码块
	 * 同步的意思
	 * */
	int count=50;  //苹果数量
	
	//打印苹果剩余数量
	public synchronized void printCount(){
		if(count>0){
			count--;
			System.out.println(Thread.currentThread().getName()+"吃了一个苹果，还剩"+count+"个苹果");
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			printCount();
		}
	}
	
	public static void main(String[] args) {
		Demo1_Synchronized syn=new Demo1_Synchronized();
		
		new Thread(syn, "小A").start();
		new Thread(syn, "小B").start();
		new Thread(syn, "小C").start();
				
	}
}
