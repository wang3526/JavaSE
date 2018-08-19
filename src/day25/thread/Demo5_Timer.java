package day25.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class Demo5_Timer {
	/**
	 * 计时器
	 * @throws Exception 
	 * */
	public static void main(String[] args) throws Exception {
		//1、创建计时器对象,设置为守护线程
		Timer t1=new Timer();
		//2、添加任务
		//设置时间格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//将指定日期字符串转换成日期对象
		Date d1=sdf.parse("2018-08-17 17:11:00");
		
		t1.schedule(new TimerTask() { //指定任务，在指定时间执行
			
			@Override
			public void run() {
				System.out.println("七夕");
			}
		}, d1);
		
		t1.schedule(new TimerTask() {   //从当前时间延时多少毫秒执行
			
			@Override
			public void run() {
				System.out.println("快乐");
			}
		}, 2000);
		
		t1.schedule(new TimerTask() {   //从指定的时间执行，间隔多少时间重复执行
			
			@Override
			public void run() {
				System.out.println("单身");
			}
		}, d1, 2000);
		
		t1.schedule(new TimerTask() {  //从当前时间延时多少时间开始执行，间隔多少时间重复执行
			
			@Override
			public void run() {
				System.out.println("不快乐");
			}
		}, 3000, 5000);
		
		//task.cancel();  //取消此任务
		t1.cancel();      //终止计时器，取消计时器中的所有任务
		
		System.out.println(t1.purge());//从该计时器的任务队列中删除所有取消的任务。 
		
	}
}
