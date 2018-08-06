package day11.block;
/**
 * 代码块
 * 分类：
 * 		1、局部代码块
 * 		2、初始化代码块
 * 		3、构造代码块
 * 		4、静态代码块
 * */
public class BlockDemo {
	//局部代码块
	public void methodA(){
		System.out.println("局部代码块，调用多少次，执行多少次");
	}
	public static void methodB(){
		System.out.println("局部代码块，调用多少次，执行多少次");
	}
	//初始化代码块
	{
		System.out.println("初始化代码块，优先于构造代码块，创建多少次对象，执行多少次");
	}
	//构造代码块
	public BlockDemo(){
		System.out.println("构造代码块，创建多少次对象，执行多少次");
	}
	//静态代码块
	static{
		System.out.println("静态代码块，在类加载进JVM时，执行，且只执行一次");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockDemo bDemo=new BlockDemo();
		bDemo.methodA();
		BlockDemo bDemo2=new BlockDemo();
	}

}
