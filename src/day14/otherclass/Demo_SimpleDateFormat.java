package day14.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_SimpleDateFormat {
	/**
	 * * A:DateFormat类的概述
			* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。是抽象类，所以使用其子类SimpleDateFormat
		* B:SimpleDateFormat构造方法
			* public SimpleDateFormat()
			* public SimpleDateFormat(String pattern)
		* C:成员方法
			* public final String format(Date date)
			* public Date parse(String source)
	 * @throws ParseException 
	 * */
	public static void main(String[] args) throws ParseException {
		//demo1();
		//demo2();
		//demo3();
		
		//将时间字符串转换成日期对象
		String str="2018年08月05日 15:32:48";
		SimpleDateFormat df1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d1=df1.parse(str);
		System.out.println(d1);
	}

	private static void demo3() {
		Date d1=new Date();    //获取当前日期对象
		SimpleDateFormat df1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); //创建日期格式化类对象
		System.out.println(df1.format(d1));//将日期对象转换成字符串
	}

	private static void demo2() {
		Date d1=new Date();    //获取当前日期对象
		SimpleDateFormat df1=new SimpleDateFormat(); //创建日期格式化类对象
		System.out.println(df1.format(d1));   //18-8-5 下午3:20
	}

	private static void demo1() {
		//DateFormat df=new DateFormat();//DateFormat是抽象类，不允许实例化
		DateFormat df1=new SimpleDateFormat();//父类引用指向子类对象
	}
}
