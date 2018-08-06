package day12.arrays;
/**
 * * A:int -- String
	* a:和""进行拼接
	* b:public static String valueOf(int i)
	* c:int -- Integer -- String(Integer类的toString方法())
	* d:public static String toString(int i)(Integer类的静态方法)
* B:String -- int
	* a:String -- Integer -- int
	* public static int parseInt(String s)
基本数据类型包装类有八种，其中七种都有parseXXX的方法，
可以将这七种的字符串表现形式转换成基本数据类型 * */
public class Demo02 {
	public static void main(String[] args) {
		//demo();
		//demo1();
		String s1="true";
		boolean b=Boolean.parseBoolean(s1);
		System.out.println(b);
		
		//String s2="abc";
		//char c=Character.p    //char的包装类Character中没有parseXXX的方法
		                     //字符串到字符的装换通过toCharArray（）就可以把字符串转换成字符数组
	}

	private static void demo1() {
		//String  --->int    String转换int
		String s1="200";
		Integer i1=new Integer(s1);
		int i2=i1.intValue();    //将Integer转换成int
		
		int i3=Integer.parseInt(s1); //将String转换为int,推荐用这种
	}

	private static void demo() {
		//int ---->String   int转换成String
		int i=100;
		String s1=i+"";          //推荐用
		String s2=String.valueOf(i); //推荐用
		
		System.out.println(s2);
		Integer i2=new Integer(i);
		String s3=i2.toString();
		
		String s4=Integer.toString(i);
		System.out.println(s1);
	}
}
