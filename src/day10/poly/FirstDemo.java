package day10.poly;

public class FirstDemo {
	String age;
	public FirstDemo() {
		// TODO Auto-generated constructor stub
	}
	public FirstDemo(String age){
		this.age=age;
	}
	public static void main(String[] args) {
		FirstDemo f1=new FirstDemo("12");
		FirstDemo f2=new FirstDemo("12");
		if(f1.age.equals(f2.age)){
			System.out.println("ÊÇ");
		}else{
			System.out.println("·ñ");
		}
	}
}
