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
		
		//t1.setPriority(10);//����������ȼ�
		//t2.setPriority(1);
		
		t1.setPriority(Thread.MIN_PRIORITY);//�����߳����ȼ�--��С
		t2.setPriority(Thread.MAX_PRIORITY);//�����߳����ȼ�--���
		
		t1.start();
		t2.start();
	}
}
