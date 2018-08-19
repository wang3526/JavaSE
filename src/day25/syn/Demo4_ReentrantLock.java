package day25.syn;

import java.util.concurrent.locks.ReentrantLock;

public class Demo4_ReentrantLock implements Runnable{
	private int count=50;
	//����һ��������
	ReentrantLock r=new ReentrantLock();
	
	@Override
	public void run() {
		while(true){
			for(int i=0;i<50;i++){
				 r.lock(); //����
				if(count>0){
					count--;
					System.out.println(Thread.currentThread().getName()+"����һ��ƻ������ʣ"+count+"��ƻ��");
				}
				r.unlock();   //����
			}
		}
	}
	public static void main(String[] args) {
		Demo4_ReentrantLock d1=new Demo4_ReentrantLock();
		new Thread(d1, "СA").start();
		new Thread(d1, "СB").start();
	}
}
