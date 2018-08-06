package day14.enumdemo;

/**
 * 定义枚举类
 *
 */
enum WeekDay{
	MON, TUES, WEDNES, THURS, FRI, SATUR, SUN;
}

public class Demo_enum{
	private WeekDay restDay;  //定义一个枚举类型的变量

	public WeekDay getRestDay() {
		return restDay;
	}

	public void setRestDay(WeekDay restDay) {
		this.restDay = restDay;
	}
	//判断是否是休息日
	public void isRestDay(){
		switch (this.restDay) {
		case MON:
		case TUES:
		case WEDNES:
		case THURS:
		case FRI:
		case SATUR:
			System.out.println("搬砖日");
			break;
		case SUN:
			System.out.println("休息日");
		}
	}
	
	public static void main(String[] args) {
		Demo_enum de=new Demo_enum();
		de.setRestDay(WeekDay.SUN);
		de.isRestDay();
		//获取枚举对象的名称
		String name=WeekDay.SATUR.name();
		System.out.println(name);
		name=WeekDay.FRI.toString();
		System.out.println(name);
		//获取枚举对象的序号
		int index=WeekDay.MON.ordinal();
		System.out.println(index);
		//获取所有枚举常量，返回一个数组
		WeekDay[] arr=WeekDay.values();
		for (WeekDay weekDay : arr) {
			System.out.println(weekDay);
		}
		//将String类型转换成枚举常量    String名称必须与枚举常量名称一致
		WeekDay day=WeekDay.valueOf("MON");
		System.out.println(day);
		System.out.println(day.ordinal());
		
	}
}

