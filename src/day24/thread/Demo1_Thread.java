package day24.thread;

/**
 * Demo1_Thread�̳���Thread
 * ��ô�������һ���߳���
 * ��������������дrun����
 * run�������߳���
 * */
public class Demo1_Thread extends Thread{
	
	@Override
	public void run() {
		//�߳���
		try {
			Thread.sleep(1000);//��ǰ�߳�����1��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		method();
	}
	
	public static void method(){
		//��ȡ��ǰ�߳�
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		//��ȡ��ǰ�߳�
		Thread t=Thread.currentThread();
		//��ȡ��ǰ�߳�����
		System.out.println(t.getName());
		//�鿴��ǰ�̵߳�״̬
		System.out.println(t.getState());
		//�鿴�߳�id
		System.out.println(t.getId());
		//�鿴�߳����ȼ�
		System.out.println(t.getPriority());
		method();
		
		//����һ�����߳�
		Demo1_Thread d=new Demo1_Thread();
		//�����߳���
		d.setName("С��");
		//�����̣߳�����ֱ�ӵ���run����������ͨ��start�����á�
		d.start();
		System.out.println("ִ�����");
	}
}

