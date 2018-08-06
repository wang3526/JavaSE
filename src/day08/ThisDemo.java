package day08;

//class Operation{
//	//接收一个对象，将对象的name的值赋值“多啦A梦”
//	public static void setValue(ThisDemo demo){
//		demo.setName("多啦A梦");
//	}
//}

public class ThisDemo {
	//构造方法之间互调时候，可以使用
	//this([参数])
	//构造方法重载
	public ThisDemo(){
		System.out.println("默认");
	}
	
	public ThisDemo(String name){
		this();
		System.out.println("一个参数");
	}
	public ThisDemo(String name,int age){
		//构造方法调用时this（）而且必须在构造方法的第一行
		this("小乔");
		System.out.println("两个参数");
	}
	
	
	
	/*
	//this 作为方法参数
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//自定义一个方法
	public void methodA(){
		//获取到this,将this作为参数传递给另一个方法
		Operation.setValue(this);
	}


	*/


	/**
	//this 可以作为方法的返回值（链式编程）
	public void methodA(){
		System.out.println("确认过眼神");
	}
	
	//定义一个方法，有返回值
	public ThisDemo methodB(){
		System.out.println("走马");
		//将当前对象返回
		return this;
	}
	*/
	
	/*
	// this 关键字可以解决成员变量和局部变量二义性
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//局部变量和成员变量的二义性
		this.name = name;
	}
	*/
	public static void main(String[] args) {
		//初始化一个对象
		//ThisDemo demo=new ThisDemo();//调用默认构造
		//ThisDemo demo=new ThisDemo("小乔");//调用一个参数的构造
		ThisDemo demo=new ThisDemo("小乔",18);//调用两个参数的构造
		
		
		
		
		/*
		ThisDemo demo=new ThisDemo();
		demo.methodA();
		System.out.println(demo.getName());
		*/
		
		/**
		//初始化一个对象ThisDemo
		ThisDemo demo=new ThisDemo();
//		System.out.println("demo:"+demo);
		//调用方法
//		ThisDemo demo1=demo.methodB();
//		System.out.println("demo1:"+demo1);
		demo.methodB().methodA();  //链式编程
		*/
		
		/*
		ThisDemo demo = new ThisDemo();
		demo.setName("mars");
		System.out.println(demo.getName());
		*/
	}

}
