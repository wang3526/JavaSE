package day25.syn;

public class Demo2_Synchronized implements Runnable{
	/**
	 * ͬ�������
	 * */
	int count=50;
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			synchronized (this) {
					if(count>0){
					count--;
					System.out.println(Thread.currentThread().getName()+"����һ��ƻ������ʣ"+count+"��ƻ��");
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		Demo2_Synchronized syn=new Demo2_Synchronized();
		
		new Thread(syn, "СA").start();
		new Thread(syn, "СB").start();
		new Thread(syn, "СC").start();
	}
}
