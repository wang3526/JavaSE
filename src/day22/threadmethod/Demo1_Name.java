package day22.threadmethod;

public class Demo1_Name {
	public static void main(String[] args) {
		//demo1();
		Thread t1=new Thread(){
			public void run(){
				//this.setName("С��");
				System.out.println(this.getName()+"aaaaaaa");
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				//this.setName("����");
				System.out.println(this.getName()+"bb");
			}
		};
		
		t1.setName("С��");
		t2.setName("����");
		t1.start();
		t2.start();
	}

	private static void demo1() {//ͨ�����췽����Name��ֵ
		new Thread("С��"){
			public void run(){
				System.out.println(this.getName()+"aaaaaaa");
			}
		}.start();
		
		new Thread("����"){
			public void run(){
				System.out.println(this.getName()+"bb");
			}
		}.start();
	}
}
