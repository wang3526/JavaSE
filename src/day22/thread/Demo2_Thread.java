package day22.thread;

public class Demo2_Thread {
	public static void main(String[] args) {
		MyThread mt=new MyThread();   //4������Thread����������
		mt.start();                   //5�������߳�
		
		for(int i=0;i<1000;i++){
			System.out.println("bb");
		}
	}
}

class MyThread extends Thread{//1���̳�Thread
	public void run(){        //2����дrun����
		for(int i=0;i<1000;i++){
			System.out.println("aaaaaaaaaa");//3����Ҫִ�еĴ���д��run������
		}
	}
}
