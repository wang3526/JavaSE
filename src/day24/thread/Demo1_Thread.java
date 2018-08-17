package day24.thread;

/**
 * Demo1_Thread继承了Thread
 * 那么该类就是一个线程类
 * 必须在子类中重写run方法
 * run方法是线程体
 * */
public class Demo1_Thread extends Thread{
	
	@Override
	public void run() {
		//线程体
		try {
			Thread.sleep(1000);//当前线程休眠1秒
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		method();
	}
	
	public static void method(){
		//获取当前线程
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		//获取当前线程
		Thread t=Thread.currentThread();
		//获取当前线程名称
		System.out.println(t.getName());
		//查看当前线程的状态
		System.out.println(t.getState());
		//查看线程id
		System.out.println(t.getId());
		//查看线程优先级
		System.out.println(t.getPriority());
		method();
		
		//创建一个子线程
		Demo1_Thread d=new Demo1_Thread();
		//设置线程名
		d.setName("小明");
		//启动线程，不能直接调用run方法，必须通过start来调用。
		d.start();
		System.out.println("执行完毕");
	}
}

