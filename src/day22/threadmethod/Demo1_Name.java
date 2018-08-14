package day22.threadmethod;

public class Demo1_Name {
	public static void main(String[] args) {
		//demo1();
		Thread t1=new Thread(){
			public void run(){
				//this.setName("小乔");
				System.out.println(this.getName()+"aaaaaaa");
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				//this.setName("大乔");
				System.out.println(this.getName()+"bb");
			}
		};
		
		t1.setName("小乔");
		t2.setName("大乔");
		t1.start();
		t2.start();
	}

	private static void demo1() {//通过构造方法给Name赋值
		new Thread("小乔"){
			public void run(){
				System.out.println(this.getName()+"aaaaaaa");
			}
		}.start();
		
		new Thread("大乔"){
			public void run(){
				System.out.println(this.getName()+"bb");
			}
		}.start();
	}
}
