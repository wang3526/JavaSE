package day22.threadmethod;

public class Demo5_Join {
	/**
	 * * join(), ��ǰ�߳���ͣ, �ȴ�ָ�����߳�ִ�н�����, ��ǰ�߳��ټ���
	 	* join(int), ���Եȴ�ָ���ĺ���֮�����
	 * */
	public static void main(String[] args) {
		final Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println(getName()+"....aaaaaaaaa");
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					if(i==2){
						try {
							//t1.join();
							t1.join(1);//���ָ����ʱ�䣬����ָ����ʱ��������߳̽���ִ��
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(getName()+"....bb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
