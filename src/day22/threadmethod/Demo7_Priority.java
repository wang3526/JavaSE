package day22.threadmethod;

public class Demo7_Priority {
	
	public static void main(String[] args) {
		Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println(getName()+"......aaaaaaaaaaa");
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println(getName()+"......bb");
				}
			}
		};
		
		//t1.setPriority(10);//设置最大优先级
		//t2.setPriority(1);
		
		t1.setPriority(Thread.MIN_PRIORITY);//设置线程优先级--最小
		t2.setPriority(Thread.MAX_PRIORITY);//设置线程优先级--最大
		
		t1.start();
		t2.start();
	}
}
