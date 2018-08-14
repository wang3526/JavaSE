package day22.thread;

public class Demo1_Thread {
	/**
	 * 证明JVM是多线程的
	 * */
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Demo();
		}
		
		for(int i=0;i<10000;i++){
			System.out.println("我是主线程的执行代码");
		}
		
	}
}

class Demo{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("垃圾被清扫了");
	}
	
}