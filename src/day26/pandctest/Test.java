package day26.pandctest;

public class Test {
	public static void main(String[] args) {
		//创建商店对象
		Shop shop=new Shop();
		//创建生产者和消费者对象
		Producer p=new Producer(shop);
		Customer c=new Customer(shop);
		
		//启动线程
		p.start();
		c.start();
	}
}
