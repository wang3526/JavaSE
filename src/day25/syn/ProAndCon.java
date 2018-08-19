package day25.syn;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProAndCon{
	/**
	 * �����ߡ�����������
	 * �������������ӡ������߳԰��ӡ�������Դ����
	 * */
	public static void main(String[] args) {
		ShareResource sr=new ShareResource();
		Producer p=new Producer(sr);
		Consumer c=new Consumer(sr);
		p.start();
		c.start();
		
		
		
	
	}
}

//������Դ---����
class ShareResource{	
	ReentrantLock reen=new ReentrantLock();//����������
	Condition c1=reen.newCondition();      //
	Condition c2=reen.newCondition();
	int count=0; //��������
}

//������
class Producer extends Thread{
	private ShareResource resource;   //������Դ����
	
	public Producer() {               //�޲ι���

	}

	public Producer(ShareResource resource) {   //�вι���
		this.resource = resource;
	}
	
	@Override
	public void run() {                         //��дrun����
			while(true){
				try {
					add();
					Thread.sleep((int)(Math.random()*500));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
	public void add() throws InterruptedException{      //��������
		resource.reen.lock();            //����
		if(resource.count==20){          //�жϰ������Ƿ����20
			resource.c1.await();         //�ǣ��ȴ�
		}
		resource.count++;            //�ǣ���������
		System.out.println("������һ�����Ӱ�����"+resource.count);
			
		if(resource.count>10){           //�жϰ������Ƿ����10
			resource.c2.signal();        //����������
		}
		resource.reen.unlock();          //����
	}
}

//������
class Consumer extends Thread{
	private ShareResource resource;  //������Դ����

	public Consumer() {				 //�޲ι���
		
	}

	public Consumer(ShareResource resource) {   //�вι���
		this.resource = resource;
	}
	
	public void delete() throws InterruptedException{
		resource.reen.lock();			//����
			if(resource.count==0){		//�жϰ������Ƿ����0
				resource.c2.await();	//�ǣ��ȴ�
			}
			if(resource.count>5){		//�жϰ������Ƿ����5
				resource.count--;		//�԰���
				System.out.println("����һ�����Ӱ�������ʣ"+resource.count);
			}
			if(resource.count<=5){		//�жϰ����Ƿ�С�ڵ���10
				resource.c1.signal();   //�ǣ�����������
			}
		resource.reen.unlock();         //����
	}
	
	@Override
	public void run() {
			while(true){
				try {
					delete();
					Thread.sleep((int)(Math.random()*500));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
}