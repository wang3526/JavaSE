package day22.thread;

public class Demo3_Thread {
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();   //4������Runnable�������
		//Runnable target=mr;
		Thread t=new Thread(mr);          //5�����䵱���������ݸ�Thread�Ĺ��췽��
		t.start();                        //6�������߳�
		
		for(int i=0;i<1000;i++){
			System.out.println("bb");
		}
	}
}

class MyRunnable implements Runnable{//1������һ����ʵ��Runnable
	@Override
	public void run() {  //2����дrun����
		for(int i=0;i<1000;i++){
			System.out.println("aaaaaaaaaa");//3����Ҫִ�еĴ���д��run������
		}	
	}
}
