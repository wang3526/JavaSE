package day23.thread;

public class Demo2_Notify {
	/**
	 * �ȴ����ѻ���
	 * */
	public static void main(String[] args) {
		final Printer p=new Printer();
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}

//�ȴ����ѻ���
class Printer{
	private int flag=1;
	public void print1() throws InterruptedException{//ͬ������ֻ��Ҫ�ڷ����ϼ�synchronized�ؼ���
		synchronized (this) {
			if(flag!=1){
				this.wait();  //��ǰ�̵߳ȴ�
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
			flag=2;
			this.notify();//������ѵ����ȴ����߳�
		}
			
	}
		
	public void print2() throws InterruptedException{
		synchronized(this){        //��������������������Ϊ����������ͬһ������
			if(flag!=2){
				this.wait();
			}
			System.out.print("³");
			System.out.print("��");
			System.out.print("\r\n");
			flag=1;
			this.notify();
		}
	}
}
