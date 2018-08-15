package day23.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo1_Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer timer=new Timer();
		//在指定时间安排指定任务，第一个参数是安排的任务，第二个参数是执行的时间，第三个参数是过多长时间重复执行
		timer.schedule(new MyTimerTask(), new Date(118, 7, 15, 7, 54, 00),3000);
		
		while(true){
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}
}

class MyTimerTask extends TimerTask{
	@Override
	public void run() {
		System.out.println("起床背英语单词");
		
	}
}