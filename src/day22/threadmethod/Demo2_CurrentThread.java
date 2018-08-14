package day22.threadmethod;

public class Demo2_CurrentThread {
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				System.out.println(getName()+"aaaaaaaaaa");
			}
		}.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				//Thread.currentThread()��ȡ��ǰ����ִ�е��߳�
				System.out.println(Thread.currentThread().getName()+"bb");
			}
		}).start();
		
		Thread.currentThread().setName("�������߳�");
		System.out.println(Thread.currentThread().getName());
	}
}
