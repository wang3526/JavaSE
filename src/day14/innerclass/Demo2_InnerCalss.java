package day14.innerclass;

public class Demo2_InnerCalss {
	String name;
	static int number;
	public void methodA(){
		System.out.println("外部类实例方法");
	}
	public static void methodB(){
		System.out.println("外部类静态方法");
	}
	/**
	 * 静态内部类
	 * 	位置:类中方法外
	 * 	修饰：final abstract static private public protected
	 * 	成员：可以是静态和非静态
	 * 	
	 * */
	
	static class Inner{
		String name;
		static int age; 
		public Inner(){
			
		}
		
		public void methodA(){
			System.out.println("内部类实例方法");
			//静态内部类的实例成员可以访问外部类的静态成员
			number=112;
			name="mars";//内部类成员
			//Demo2_InnerCalss.this.name="小乔";//不允许访问外部类的实例成员
		}
		public static void methodB(){
			//只能访问静态成员
			System.out.println("内部类的静态方法");
		}
	}
	
	public static void main(String[] args) {
		//初始化静态内部类,没有初始化外部类
		Demo2_InnerCalss.Inner inner=new Demo2_InnerCalss.Inner();
		//访问内部类成员，可以访问所有成员
		inner.methodA();//内部类实例方法
		inner.methodB();//内部类静态方法
		
		//直接访问内部类静态成员,类名访问
		Demo2_InnerCalss.Inner.age=11;
		Demo2_InnerCalss.Inner.methodB();
		
		//内部类访问外部类成员，只能访问静态成员
		
	}
}
