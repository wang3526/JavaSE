package day20.chario;

public class Demo6_Wrap {
	/**
	 * 装饰设计模式的好处是：
	 * 耦合性不强，被装饰的类的变化与装饰类的变化无关
	 * */
	public static void main(String[] args) {
		HeimaStudent hs=new HeimaStudent(new Student());
		hs.code();
	}
}

interface Coder{
	public void code();
}

class Student implements Coder{
	@Override
	public void code() {
		System.out.println("JavaSE");
		System.out.println("JavaWeb");
	}
}

class HeimaStudent implements Coder{
	//1、获取被装饰类的引用
	private Student s;   //获取学生引用
	
	//2、在构造方法中传入被装饰的对象
	public HeimaStudent(Student s) {
		super();
		this.s = s;
	}
	
	//3、对原有的功能进行升级
	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("数据库");
		System.out.println("大数据");
		System.out.println("......");
	}
}