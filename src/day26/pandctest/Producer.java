package day26.pandctest;

//������
public class Producer extends Thread{
	private Shop shop;   //���Ǹ��̵깩��
	
	public Producer(){
		
	}
	
	public Producer(Shop shop) {
		this.shop = shop;
	}



	//���̵깩��
	@Override
	public void run() {
		//�߳���
		//�������̵깩��
		while(true){
			try {
				Thread.sleep(300);
				this.shop.push();//���̵귢�ͻ���
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
