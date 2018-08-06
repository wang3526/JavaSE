package day12.stringbuffer;
/**
 * A:String -- StringBuffer
	* a:通过构造方法
	* b:通过append()方法
* B:StringBuffer -- String
	* a:通过构造方法
	* b:通过toString()方法
	* c:通过subString(0,length);
 * */
public class Demo06 {
	public static void main(String[] args) {
		//demo();
		StringBuffer sb1=new StringBuffer("heima");
		
		String s1=new String(sb1);
		System.out.println(s1);//通过构造方法将StringBuffer装换为String
		
		String s2=sb1.toString();
		System.out.println(s2);//通过toString方法将StringBuffer转换成String
		
		String s3=sb1.substring(0, sb1.length());
		System.out.println(s3);//通过subString方法截取将StringBuffer装换为String
	}

	private static void demo() {
		StringBuffer sb=new StringBuffer("heima");//通过构造方法将字符串装换成StringBuffer对象
		System.out.println(sb);
		
		StringBuffer sb2=new StringBuffer();
		sb2.append("heima"); //通过append方法将字符串转换成StringBuffer对象
		System.out.println(sb2);
	}
}
