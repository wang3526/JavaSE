package day23.thread;

public class Demo3_NotifyAll {
	public static void main(String[] args) {
		final Printer2 p=new Printer2();
		
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
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}

/**
 * 1����ͬ��������У����ĸ������������ĸ��������wait����
 * 2��Ϊʲôwait��notify��Щ������Ҫ������Object������У�
 * ��������������������ô��������Ӧ���඼��Object�����࣬Ҳ����Object��������Ļ��࣬
 * ���Խ�����������Object������оͻ���������������е���
 * 3��sleep������wait����������
 * a��sleep������ͬ��������л�ͬ�������У����ͷ�����˯����Ҳ�ᱧ����˯��
 * 	  wait������ͬ��������л�ͬ�������У��ͷ���
 * b��sleep�������봫�������������ʵ����ʱ�䣬ʱ�䵽�ˣ��Զ�����
 * 	  wait�������Դ������Ҳ���Բ��������
 * 		�����wait��������ʱ��������÷���sleep���ƣ�ʱ�䵽��ֹͣ�ȴ���ͨ���õ����޲�����wait������
 * */
class Printer2{
	private int flag=1;
	public void print1() throws InterruptedException{//ͬ������ֻ��Ҫ�ڷ����ϼ�synchronized�ؼ���
		synchronized (this) {
			while(flag!=1){
				this.wait();  //��ǰ�̵߳ȴ�
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
			flag=2;
			//this.notify();
			this.notifyAll();//������ѵ����ȴ����߳�
		}
			
	}
		
	public void print2() throws InterruptedException{
		synchronized(this){        //��������������������Ϊ����������ͬһ������
			while(flag!=2){
				this.wait();       //�߳�2�ڴ˵ȴ�
			}
			System.out.print("³");
			System.out.print("��");
			System.out.print("\r\n");
			flag=3;
			//this.notify();
			this.notifyAll();
		}
	}
	
	public void print3() throws InterruptedException{
		synchronized(this){        //��������������������Ϊ����������ͬһ������
			while(flag!=3){        //�߳�3�ڴ˵ȴ���if�����������ȴ���������������
				this.wait();       //whileѭ����ѭ���жϣ�ÿ�ζ����жϱ��
			}
			System.out.print("h");
			System.out.print("e");
			System.out.print("l");
			System.out.print("l");
			System.out.print("o");
			System.out.print("\r\n");
			flag=1;
			//this.notify();
			this.notifyAll();            //1.5֮ǰ�������
		}
	}
}