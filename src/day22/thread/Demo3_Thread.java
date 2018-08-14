package day22.thread;

public class Demo3_Thread {
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();   //4、创建Runnable子类对象
		//Runnable target=mr;
		Thread t=new Thread(mr);          //5、将其当作参数传递给Thread的构造方法
		t.start();                        //6、开启线程
		
		for(int i=0;i<1000;i++){
			System.out.println("bb");
		}
	}
}

class MyRunnable implements Runnable{//1、定义一个类实现Runnable
	@Override
	public void run() {  //2、重写run方法
		for(int i=0;i<1000;i++){
			System.out.println("aaaaaaaaaa");//3、将要执行的代码写在run方法中
		}	
	}
}
