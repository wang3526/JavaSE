package day26.pandctest;

public class Shop {
	private int count=0;  //���������
	
	//����
	public synchronized void push() throws InterruptedException{
		if(count==20){
			this.wait();   //�õ�ǰ�̵߳ȴ�
		}//������1
		count++;
		System.out.println("��ǰ�̵�Ļ���������"+count);
		//�ù����߹���
		this.notify();
	}
	//����
	public synchronized void pop() throws InterruptedException{
		if(count==0){
			this.wait();  	//�õ�ǰ�̵߳ȴ�
		}
		//������1
		count--;
		System.out.println("��ǰ�̵�Ļ���ʣ��"+count);
		//֪ͨ�̵깺��
		this.notify();
	}
}
