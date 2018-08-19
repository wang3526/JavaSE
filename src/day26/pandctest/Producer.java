package day26.pandctest;

//生产者
public class Producer extends Thread{
	private Shop shop;   //给那个商店供货
	
	public Producer(){
		
	}
	
	public Producer(Shop shop) {
		this.shop = shop;
	}



	//给商店供货
	@Override
	public void run() {
		//线程体
		//持续给商店供货
		while(true){
			try {
				Thread.sleep(300);
				this.shop.push();//给商店发送货物
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
