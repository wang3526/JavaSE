package day14.innerclass;
/**
 * 内部类：
 * 		在类的内部再定义一个类，可以看做类的成员
 * 类的成员：
 * 		字段、方法、类
 * 内部类分类：
 * 		1、实例内部类     
 * 		2、静态内部类
 * 		3、局部内部类
 * 		4、匿名内部类
 * @author Administrator
 *
 */
public class Demo1_InnerClass {
	//外部类的属性
	String name;    //实例成员
	static int age;       
	//外部类的方法
	public void methodA(){
		System.out.println(name+"外部类方法");
	}
	//定义实例内部类
	/**
	 * 实例内部类
	 * 	位置：类中方法外
	 * 	可以使用的修饰符：public private 默认 protected
	 *	 不能用static
	 *	
	 *	类中定义的成员
	 *		不能使用static修饰
	 *		访问权限修饰符-都可以
	 *
	 *	内部类访问外部类成员
	 *		在内部类中可以直接访问外部类的成员(实例和静态)
	 *		
	 * */
	class Inner{
		//定义内部成员
		String name;   //实例成员
		//ststic int age;  //不能使用static进行修饰
		public void printmsg(){
			System.out.println(name+age+"实例内部类的方法");
		}
		
		public void printOutMsg(){
			//如果外部类成员和内部类成员一致，默认访问内部类成员
			//如果访问外部类成员
			System.out.println(Demo1_InnerClass.this.name);
			//如果在内部类访问外部类方法，外部类类名.this.方法名
			Demo1_InnerClass.this.methodA();
		}
		public void methodA(){
			System.out.println("内部类方法");
		}
		public Inner(){
			System.out.println("Inner构造方法");
		}
		public Inner(String name){
			this.name=name;
			Demo1_InnerClass.this.name=name;
		}
	}
	public static void main(String[] args) {
		//初始化外部类
		Demo1_InnerClass di=new Demo1_InnerClass();
		di.name="大乔";
		//初始化内部类对象
		Inner inner=di.new Inner();
		//Inner inner=di.new Inner("小乔");
		//给内部类属性赋值
		inner.name="小乔";
		//访问内部类方法
		inner.printmsg();
		inner.printOutMsg();
		inner.methodA();
		//di.methodA();
	}
	
	
}
