package day16.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1_Calendar {
	/**
	 * ������
	 * Calendar
	 * �����Date
	 * 1����ȡʱ��get(filed)
	 * 2������ʱ��set(file)
	 * */
	public static void main(String[] args) {
		//��ȡ��������
		Calendar c=Calendar.getInstance();
		//����������ת����Date
		Date d=c.getTime();
		System.out.println(d);
		//����ת����ʱ���
		long l1=c.getTimeInMillis();
		System.out.println(l1);
		//��ȡ������ʱ��
		System.out.println(c.get(Calendar.YEAR));//��ȡ��
		System.out.println(c.get(Calendar.MONTH));//��ȡ�·ݣ���0��ʼ
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//����µĵڼ���
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//����ܵĵڼ��죬����һ�ܵ�һ��������
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//����������µĵڼ��ܣ���1�ſ�ʼ������
		System.out.println(c.get(Calendar.AM_PM));//���磨0�������磨1��
		System.out.println(c.get(Calendar.DATE));//����µĵڼ���
		System.out.println(c.get(Calendar.HOUR_OF_DAY));//��ȡСʱ��24Сʱ��
		System.out.println(c.get(Calendar.HOUR));//12Сʱ��
		System.out.println(c.get(Calendar.MINUTE));//��ȡ����
		System.out.println(c.get(Calendar.SECOND));//��ȡ��
		System.out.println(c.get(Calendar.MILLISECOND));//��ȡ����
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));//����µĵڼ���
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));//��һ��ĵڼ���
		System.out.println(c.get(Calendar.DAY_OF_YEAR));//��һ��ĵڼ���
		
		//ʹ���ֶ�����ʱ��
		c.set(Calendar.AM_PM, Calendar.PM);
		c.setTime(new Date());  //��Dateת��������
		System.out.println(c.get(Calendar.AM_PM));
		c.setTimeInMillis(l1);//��ʱ���ת��������
		System.out.println(c.getTime());
		
		//�Զ���ʱ���ʽ
		Calendar c1=Calendar.getInstance();//��ȡ��������
		Date d1=c1.getTime();//����������ת����Date����
		SimpleDateFormat df=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss E");
		System.out.println(df.format(d1));
	}
}
