package day23.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo1_Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer timer=new Timer();
		//��ָ��ʱ�䰲��ָ�����񣬵�һ�������ǰ��ŵ����񣬵ڶ���������ִ�е�ʱ�䣬�����������ǹ��೤ʱ���ظ�ִ��
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
		System.out.println("�𴲱�Ӣ�ﵥ��");
		
	}
}