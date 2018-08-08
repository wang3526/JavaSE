package day16.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_Date {
	/**
	 * Date��һ��������
	 * 	�����У����Ի�ȡ��ǰϵͳ��ʱ��
	 * 	��ȡʱ���������Ϊ��λ����1970-01-01 00��00��00Ϊ��׼ʱ�䣬��֮��Ĳ�
	 * @throws ParseException 
	 * */
	public static void main(String[] args) throws ParseException {
		//��ʼ��date���󣬻�ȡ��ǰϵͳʱ��
		Date d=new Date();
		//��ӡϵͳʱ�䣬Ĭ�ϸ�ʽ
		System.out.println(d);
		//��ȡ��ǰʱ��Ϊʱ���
		long l=d.getTime();
		System.out.println(l);
		//ͨ��ʱ�������������
		Date d1=new Date(l);
		System.out.println(d1);
		//ֻתʱ��
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(d1));
		//ֻת����
		System.out.println(DateFormat.getTimeInstance().format(d1));
		//����ʱ��
		System.out.println(DateFormat.getDateTimeInstance().format(d1));
		DateFormat df=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(d1));
		//ת����Date����
		Date d2=df.parse(df.format(d1));
		System.out.println("ת����"+d2);
		
		System.out.println(SimpleDateFormat.getDateInstance().format(d1));
	}
}
