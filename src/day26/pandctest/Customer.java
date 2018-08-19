package day26.pandctest;

//消费者
public class Customer extends Thread {
	private Shop shop;   //确定要去那个商店买东西
	
	public Customer() {
	
	}

	public Customer(Shop shop) {
		this.shop = shop;
	}

	// 从商店买东西
	@Override
	public void run() {
		// 消费者不停从商店买东西
		while (true) {
			try {
				Thread.sleep(500);
				this.shop.pop();//从商店不停的出货物
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
