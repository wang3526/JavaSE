package day25.syn;

public class Demo1_Synchronized implements Runnable{
	/**
	 * Synchronized���η�
	 * ��������ʵ������
	 * �������δ����
	 * ͬ������˼
	 * */
	int count=50;  //ƻ������
	
	//��ӡƻ��ʣ������
	public synchronized void printCount(){
		if(count>0){
			count--;
			System.out.println(Thread.currentThread().getName()+"����һ��ƻ������ʣ"+count+"��ƻ��");
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			printCount();
		}
	}
	
	public static void main(String[] args) {
		Demo1_Synchronized syn=new Demo1_Synchronized();
		
		new Thread(syn, "СA").start();
		new Thread(syn, "СB").start();
		new Thread(syn, "СC").start();
				
	}
}
