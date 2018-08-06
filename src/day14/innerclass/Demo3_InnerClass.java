package day14.innerclass;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class Demo3_InnerClass {
	String name;
	static String sex;
	public void methodA(){
		System.out.println("外部类实例方法");
	}
	
	/**
	 * 局部内部类
	 * 位置：方法中
	 * 成员：必须都是实例成员
	 * 只能在声明的方法中使用
	 * */
	public void methodB(){
		int num=10;
		class Inner{
			String name;
			int age;
			
			public void methodC(){
				//局部内部类可以访问外部类的所有成员
				System.out.println(sex);
				//访问外部类，方法内的局部变量,局部变量必须加上final修饰符，JDK1.8之后不需要添加
				System.out.println(num);
				System.out.println("局部内部类实例方法");
			}
			
			/*public static void methodD(){
				System.out.println("局部内部类的静态方法");
			}*/
		}
		//初始化内部类对象
		Inner inner=new Inner();
		//访问成员
		inner.name="mars";
		inner.age=12;
		inner.methodC();
	}
	
	public static void main(String[] args) {
		//初始化外部类对象
		Demo3_InnerClass di=new Demo3_InnerClass();
		di.methodB();
	}
	
	
	
	
}
