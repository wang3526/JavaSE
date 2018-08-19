package day25.Ã¶¾Ù;

public class Demo1_Enum {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		Week3 mon=Week3.MON;
		mon.show();
	}

	private static void demo2() {
		Week2 mon=Week2.MON;
		System.out.println(mon.getName());
	}

	private static void demo1() {
		Week1 mon=Week1.MON;
		Week1 tue=Week1.TUE;
		Week1 wed=Week1.WED;
		
		System.out.println(mon);
	}
}
