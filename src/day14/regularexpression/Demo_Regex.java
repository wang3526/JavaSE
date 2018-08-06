package day14.regularexpression;

public class Demo_Regex {
	/**
	 * * A:字符类
	* [abc] a、b 或 c（简单类） 
	* [^abc] 任何字符，除了 a、b 或 c（否定） 
	* [a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围） 
	* [a-d[m-p]] a到d 或m到p:[a-dm-p](并集)
	* [a-z&&[def]] d、e或f(交集)
	* [a-z&&[^bc]] a到z,除了b和c:[ad-z](减去)
	* [a-z&&[^m-p]] a到z,而非m到p:[a-lq-z](减去)
	 * */
	public static void main(String[] args) {
		//demo();
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		String regex="[a-z&&[^m-p]]";
		System.out.println("m".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("z".matches(regex));
	}

	private static void demo5() {
		String regex="[a-z&&[^bc]]";
		System.out.println("b".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("e".matches(regex));
	}

	private static void demo4() {
		String regex="[a-z&&[def]]";  //取交集
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
	}

	private static void demo3() {
		String regex="[a-d[m-p]]"; //取并集
		System.out.println("a".matches(regex));
		System.out.println("m".matches(regex));
		System.out.println("n".matches(regex));
	}

	private static void demo2() {
		String regex="[a-zA-Z]";
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("1".matches(regex));
	}

	private static void demo1() {
		String regex="[^abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("%".matches(regex));
		System.out.println("10".matches(regex));//10代表代表1字符和0字符，两个字符
		System.out.println("1".matches(regex));
	}

	private static void demo() {
		String regex="[abc]";     //[]代表单个字符
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("%".matches(regex));
	}
}
