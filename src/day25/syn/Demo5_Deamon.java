package day25.syn;

public class Demo5_Deamon extends Thread{
	/**
	 * �ػ��߳�
	 * */
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(350);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("��Ϧ");
		}
	}
	
	public static void main(String[] args) {
		Demo5_Deamon d1=new Demo5_Deamon();
		d1.setDaemon(true);
		d1.start();
		System.out.println("����");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("���");
	}
}
