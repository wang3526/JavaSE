package day14.enumdemo;

/**
 * ����ö����
 *
 */
enum WeekDay{
	MON, TUES, WEDNES, THURS, FRI, SATUR, SUN;
}

public class Demo_enum{
	private WeekDay restDay;  //����һ��ö�����͵ı���

	public WeekDay getRestDay() {
		return restDay;
	}

	public void setRestDay(WeekDay restDay) {
		this.restDay = restDay;
	}
	//�ж��Ƿ�����Ϣ��
	public void isRestDay(){
		switch (this.restDay) {
		case MON:
		case TUES:
		case WEDNES:
		case THURS:
		case FRI:
		case SATUR:
			System.out.println("��ש��");
			break;
		case SUN:
			System.out.println("��Ϣ��");
		}
	}
	
	public static void main(String[] args) {
		Demo_enum de=new Demo_enum();
		de.setRestDay(WeekDay.SUN);
		de.isRestDay();
		//��ȡö�ٶ��������
		String name=WeekDay.SATUR.name();
		System.out.println(name);
		name=WeekDay.FRI.toString();
		System.out.println(name);
		//��ȡö�ٶ�������
		int index=WeekDay.MON.ordinal();
		System.out.println(index);
		//��ȡ����ö�ٳ���������һ������
		WeekDay[] arr=WeekDay.values();
		for (WeekDay weekDay : arr) {
			System.out.println(weekDay);
		}
		//��String����ת����ö�ٳ���    String���Ʊ�����ö�ٳ�������һ��
		WeekDay day=WeekDay.valueOf("MON");
		System.out.println(day);
		System.out.println(day.ordinal());
		
	}
}

