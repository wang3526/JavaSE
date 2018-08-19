package day25.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class Demo5_Timer {
	/**
	 * ��ʱ��
	 * @throws Exception 
	 * */
	public static void main(String[] args) throws Exception {
		//1��������ʱ������,����Ϊ�ػ��߳�
		Timer t1=new Timer();
		//2���������
		//����ʱ���ʽ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//��ָ�������ַ���ת�������ڶ���
		Date d1=sdf.parse("2018-08-17 17:11:00");
		
		t1.schedule(new TimerTask() { //ָ��������ָ��ʱ��ִ��
			
			@Override
			public void run() {
				System.out.println("��Ϧ");
			}
		}, d1);
		
		t1.schedule(new TimerTask() {   //�ӵ�ǰʱ����ʱ���ٺ���ִ��
			
			@Override
			public void run() {
				System.out.println("����");
			}
		}, 2000);
		
		t1.schedule(new TimerTask() {   //��ָ����ʱ��ִ�У��������ʱ���ظ�ִ��
			
			@Override
			public void run() {
				System.out.println("����");
			}
		}, d1, 2000);
		
		t1.schedule(new TimerTask() {  //�ӵ�ǰʱ����ʱ����ʱ�俪ʼִ�У��������ʱ���ظ�ִ��
			
			@Override
			public void run() {
				System.out.println("������");
			}
		}, 3000, 5000);
		
		//task.cancel();  //ȡ��������
		t1.cancel();      //��ֹ��ʱ����ȡ����ʱ���е���������
		
		System.out.println(t1.purge());//�Ӹü�ʱ�������������ɾ������ȡ�������� 
		
	}
}
