package day16.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_Date {
	/**
	 * Date是一个日期类
	 * 	在类中，可以获取当前系统的时间
	 * 	获取时间戳，毫秒为单位，以1970-01-01 00：00：00为基准时间，求之间的差
	 * @throws ParseException 
	 * */
	public static void main(String[] args) throws ParseException {
		//初始化date对象，获取当前系统时间
		Date d=new Date();
		//打印系统时间，默认格式
		System.out.println(d);
		//获取当前时间为时间戳
		long l=d.getTime();
		System.out.println(l);
		//通过时间戳，创建对象
		Date d1=new Date(l);
		System.out.println(d1);
		//只转时间
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(d1));
		//只转日期
		System.out.println(DateFormat.getTimeInstance().format(d1));
		//日期时间
		System.out.println(DateFormat.getDateTimeInstance().format(d1));
		DateFormat df=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(d1));
		//转换成Date对象
		Date d2=df.parse(df.format(d1));
		System.out.println("转换后"+d2);
		
		System.out.println(SimpleDateFormat.getDateInstance().format(d1));
	}
}
