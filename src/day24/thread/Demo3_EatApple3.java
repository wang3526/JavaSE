package day24.thread;

public class Demo3_EatApple3 {
	private static int AppleCount=50;
	public static void main(String[] args) {
		//�����̣߳�ʹ�������ڲ���
		new Thread(new Runnable() {
			public void run() {			//��дrun����
				while(AppleCount>0){    //ѭ���ж��Ƿ���ƻ��
					System.out.println("СA����һ��ƻ������ǰʣ�ࣺ"+AppleCount--+"��ƻ��");
				}
			}
		}).start();  //�����߳�
		
		new Thread(new Runnable() {
			public void run() {
				while(AppleCount>0){
					System.out.println("СB����һ��ƻ������ǰʣ�ࣺ"+AppleCount--+"��ƻ��");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				while(AppleCount>0){
					System.out.println("СC����һ��ƻ������ǰʣ�ࣺ"+AppleCount--+"��ƻ��");
				}
			}
		}).start();
	}
}

