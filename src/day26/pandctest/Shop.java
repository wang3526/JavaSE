package day26.pandctest;

public class Shop {
	private int count=0;  //货物的总数
	
	//进货
	public synchronized void push() throws InterruptedException{
		if(count==20){
			this.wait();   //让当前线程等待
		}//数量加1
		count++;
		System.out.println("当前商店的货物总数是"+count);
		//让购买者购买
		this.notify();
	}
	//出货
	public synchronized void pop() throws InterruptedException{
		if(count==0){
			this.wait();  	//让当前线程等待
		}
		//数量减1
		count--;
		System.out.println("当前商店的货物剩下"+count);
		//通知商店购买
		this.notify();
	}
}
