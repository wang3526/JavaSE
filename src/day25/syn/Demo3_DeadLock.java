package day25.syn;

public class Demo3_DeadLock implements Runnable{
	/**
	 * ����
	 * */
	Object obj=new Object();
	boolean isFlag;
	
	@Override
	public void run() {
		if(!isFlag){
			isFlag=!isFlag;
			printA();
		}else {
			printB();
		}
	}
	
	public void printA(){
		System.out.println(Thread.currentThread().getName()+"��ʼִ��---");
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+"ִ�У��ȴ���ȡobj---");
			synchronized (obj) {
				System.out.println("��ȡ��obj---");
			}
			System.out.println("obj��ȡ���---");
		}
		System.out.println(Thread.currentThread().getName()+"ִ�����---");
	}
	
	public void printB(){
		System.out.println(Thread.currentThread().getName()+"��ʼִ��");
		synchronized (obj) {
			System.out.println(Thread.currentThread().getName()+"ִ�У��ȴ���ȡthis");
			synchronized (this) {
				System.out.println("��ȡ��this");
			}
			System.out.println("this��ȡ���");
		}
		System.out.println(Thread.currentThread().getName()+"ִ�����");
	}
	public static void main(String[] args) {
		Demo3_DeadLock deadLock=new Demo3_DeadLock();
		
		new Thread(deadLock, "СA").start();
		new Thread(deadLock, "СB").start();
	}
}
