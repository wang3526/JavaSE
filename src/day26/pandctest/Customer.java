package day26.pandctest;

//������
public class Customer extends Thread {
	private Shop shop;   //ȷ��Ҫȥ�Ǹ��̵�����
	
	public Customer() {
	
	}

	public Customer(Shop shop) {
		this.shop = shop;
	}

	// ���̵�����
	@Override
	public void run() {
		// �����߲�ͣ���̵�����
		while (true) {
			try {
				Thread.sleep(500);
				this.shop.pop();//���̵겻ͣ�ĳ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
