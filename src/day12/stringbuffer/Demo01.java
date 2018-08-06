package day12.stringbuffer;
/**
 * * A:StringBuffer的构造方法：
	* public StringBuffer():无参构造方法
	* public StringBuffer(int capacity):指定容量的字符串缓冲区对象
	* public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
* B:StringBuffer的方法：
	* public int capacity()：返回当前容量。	理论值(不掌握)
	* public int length():返回长度（字符数）。 实际值
 * */
public class Demo01 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());   //容器中的字符个数，实际值
		System.out.println(sb.capacity()); //容器中的初始容量，理论值
		
		StringBuffer sb2=new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3=new StringBuffer("heima");
		System.out.println(sb3.length());	 //实际字符的个数
		System.out.println(sb3.capacity());  //字符串的length+初始容量
	}
}
 