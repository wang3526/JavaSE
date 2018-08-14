package day22.syn;

public class Demo1_Synchronized {
	/**
	 * 同步代码块
	 * */
	public static void main(String[] args) {
		final Print p=new Print();
		
		
		new Thread(){
			public void run(){
				while(true){
					p.print1();
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					p.print2();
				}
			}
		}.start();
	}
}

class Print{
	Demo demo=new Demo();
	public void print1(){
		//synchronized(new Demo()){
		synchronized(demo){        //同步代码块，锁机制，锁对象是任意的
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
		}
	}
	
	public void print2(){
		//synchronized(new Demo()){
		synchronized(demo){        //锁对象不能用匿名对象，因为匿名对象不是同一个对象
			System.out.print("鲁");
			System.out.print("班");
			System.out.print("\r\n");
		}
	}
}

class Demo{
	
}