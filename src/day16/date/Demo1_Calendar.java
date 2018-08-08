package day16.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1_Calendar {
	/**
	 * 日历类
	 * Calendar
	 * 是替代Date
	 * 1、获取时间get(filed)
	 * 2、设置时间set(file)
	 * */
	public static void main(String[] args) {
		//获取日历对象
		Calendar c=Calendar.getInstance();
		//将日历对象转换成Date
		Date d=c.getTime();
		System.out.println(d);
		//日历转换成时间戳
		long l1=c.getTimeInMillis();
		System.out.println(l1);
		//获取日历的时间
		System.out.println(c.get(Calendar.YEAR));//获取年
		System.out.println(c.get(Calendar.MONTH));//获取月份，从0开始
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//这个月的第几天
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//这个周的第几天，美国一周第一天是周日
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//当天是这个月的第几周，从1号开始计算周
		System.out.println(c.get(Calendar.AM_PM));//上午（0），下午（1）
		System.out.println(c.get(Calendar.DATE));//这个月的第几天
		System.out.println(c.get(Calendar.HOUR_OF_DAY));//获取小时，24小时制
		System.out.println(c.get(Calendar.HOUR));//12小时制
		System.out.println(c.get(Calendar.MINUTE));//获取分钟
		System.out.println(c.get(Calendar.SECOND));//获取秒
		System.out.println(c.get(Calendar.MILLISECOND));//获取毫秒
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));//这个月的第几周
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));//这一年的第几周
		System.out.println(c.get(Calendar.DAY_OF_YEAR));//这一年的第几天
		
		//使用字段设置时间
		c.set(Calendar.AM_PM, Calendar.PM);
		c.setTime(new Date());  //将Date转换成日历
		System.out.println(c.get(Calendar.AM_PM));
		c.setTimeInMillis(l1);//将时间戳转换成日历
		System.out.println(c.getTime());
		
		//自定义时间格式
		Calendar c1=Calendar.getInstance();//获取日历对象
		Date d1=c1.getTime();//将日历对象转换成Date对象
		SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		System.out.println(df.format(d1));
	}
}
