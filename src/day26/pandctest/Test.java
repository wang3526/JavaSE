package day26.pandctest;

public class Test {
	public static void main(String[] args) {
		//�����̵����
		Shop shop=new Shop();
		//���������ߺ������߶���
		Producer p=new Producer(shop);
		Customer c=new Customer(shop);
		
		//�����߳�
		p.start();
		c.start();
	}
}
