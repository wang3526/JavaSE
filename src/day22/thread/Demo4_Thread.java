package day22.thread;

public class Demo4_Thread {
	/**
	 * ʹ�������ڲ��ഴ���߳�
	 * */
	public static void main(String[] args) {
		new Thread(){                 //1���̳�Thread��
			public void run(){        //2����дrun����
				for(int i=0;i<1000;i++){//3����Ҫִ�еĴ���д��run������
					System.out.println("aaaaaaaaaa");
				}
			}
		}.start();   //4�������߳�
		
		
		new Thread(new Runnable() {//1����Runnable��������󴫵ݸ�Thread�Ĺ��췽��
			@Override
			public void run() {//2����дrun����
				for(int i=0;i<1000;i++){//3����Ҫִ�еĴ���д��run������
					System.out.println("aaaaaaaaaa");
				}	
			}
		}).start();//4�������߳�
		
	}
}
