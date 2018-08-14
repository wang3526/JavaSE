package day22.threadmethod;

public class Demo3_Sleep {
	public static void main(String[] args) throws InterruptedException {
		//demo1();
		new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName()+"a");
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName()+"b");
				}
			}
		}.start();
		
	}

	private static void demo1() throws InterruptedException {
		for (int i = 20; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println("µ¹¼ÆÊ±µÚ"+i+"Ãë");
		}
	}
}
