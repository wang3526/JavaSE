package day25.枚举;

public class Week2 {
	public static final Week2 MON=new Week2("星期一");
	public static final Week2 TUE=new Week2("星期二");
	public static final Week2 WED=new Week2("星期三");
	
	private String name;
	private Week2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
}
