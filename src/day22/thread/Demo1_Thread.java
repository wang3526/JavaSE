package day22.thread;

public class Demo1_Thread {
	/**
	 * ֤��JVM�Ƕ��̵߳�
	 * */
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Demo();
		}
		
		for(int i=0;i<10000;i++){
			System.out.println("�������̵߳�ִ�д���");
		}
		
	}
}

class Demo{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("��������ɨ��");
	}
	
}