package day12.stringbuffer;
/**
 *  A:StringBuffer的添加功能
	* public StringBuffer append(String str):
		* 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
	* public StringBuffer insert(int offset,String str):
		* 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
 	StringBuffer是字符串缓冲区，当new的时候是在堆内存创建了一个对象，底层是
 	一个长度为16的字符数组，当调用添加的方法时，不会再重新创建对象，在不断向原缓冲区添加字符
 * */

public class Demo02 {
	public static void main(String[] args) {
		//demo();
		StringBuffer sb=new StringBuffer("1234");
		sb.insert(3, "heima");   //在指定位置添加元素，如果没有指定位置的索引就会报索引越界异常
		System.out.println(sb);
	}

	private static void demo() {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		StringBuffer sb2=sb.append(true);
		System.out.println(sb2);
		StringBuffer sb3=sb2.append("heima");
		System.out.println(sb3);
		StringBuffer sb4=sb3.append(100);
		
		System.out.println(sb.toString());   //StringBuffer类中重写了toString()方法，显示的是对象的元素值 
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}
}
