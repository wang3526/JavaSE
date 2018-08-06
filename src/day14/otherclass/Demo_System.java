package day14.otherclass;

public class Demo_System {
	/**
	 * * A:System类的概述
			* System 类包含一些有用的类字段和方法。它不能被实例化。 
		* B:成员方法
			* public static void gc()
			* public static void exit(int status)
			* public static long currentTimeMillis()
			* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		* C:案例演示
			* System类的成员方法使用
	 * */
	public static void main(String[] args) {
		//demo();
		//demo2();
		//demo3();
		int[] src={11,22,33,44,55};
		int[] dest=new int[8];
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]+" ");
		}
		System.out.println();
		System.arraycopy(src, 0, dest, 0, src.length);//将数组内容拷贝
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]+" ");
		}
	}

	private static void demo3() {
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		long end=System.currentTimeMillis();//获取当前时间的毫秒值
		System.out.println(end-start);
	}

	private static void demo2() {
		System.out.println("111111111111");
		System.exit(0);//非0状态是异常终止，退出JVM
		System.out.println("4555555555555");
	}

	private static void demo() {
		for (int i = 0; i < 100; i++) {
			new Demo();
			System.gc(); //运行垃圾回收器
		}
	}
}

class Demo{   //在一个源文件中不允许定义两个用public修饰的类
	@Override
	protected void finalize(){
		System.out.println("垃圾被回收");
	}
}