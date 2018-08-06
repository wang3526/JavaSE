package day14.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_SimpleDateFormat {
	/**
	 * * A:DateFormat��ĸ���
			* DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������SimpleDateFormat
		* B:SimpleDateFormat���췽��
			* public SimpleDateFormat()
			* public SimpleDateFormat(String pattern)
		* C:��Ա����
			* public final String format(Date date)
			* public Date parse(String source)
	 * @throws ParseException 
	 * */
	public static void main(String[] args) throws ParseException {
		//demo1();
		//demo2();
		//demo3();
		
		//��ʱ���ַ���ת�������ڶ���
		String str="2018��08��05�� 15:32:48";
		SimpleDateFormat df1=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date d1=df1.parse(str);
		System.out.println(d1);
	}

	private static void demo3() {
		Date d1=new Date();    //��ȡ��ǰ���ڶ���
		SimpleDateFormat df1=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss"); //�������ڸ�ʽ�������
		System.out.println(df1.format(d1));//�����ڶ���ת�����ַ���
	}

	private static void demo2() {
		Date d1=new Date();    //��ȡ��ǰ���ڶ���
		SimpleDateFormat df1=new SimpleDateFormat(); //�������ڸ�ʽ�������
		System.out.println(df1.format(d1));   //18-8-5 ����3:20
	}

	private static void demo1() {
		//DateFormat df=new DateFormat();//DateFormat�ǳ����࣬������ʵ����
		DateFormat df1=new SimpleDateFormat();//��������ָ���������
	}
}
