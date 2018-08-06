package day14.regularexpression;

public class Demo01_Regex {
	/**
	 * * A:预定义字符类
		* . 任何字符。(与行结束符可能匹配也可能不匹配)
		* \d 数字：[0-9]
		* \D 非数字：[^0-9]
		* \s 空白字符：[ \t\n\x0B\f\r]
		* \S 非空白字符：[^\s]
		* \w 单词字符：[a-zA-Z_0-9]
		* \W 非单词字符：[^\w]
		* 
	 * */
	public static void main(String[] args) {
		//demo();
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		String regex="\\W";
		System.out.println("a".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo5() {
		String regex="\\w";
		System.out.println("a".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo4() {
		String regex="\\S";
		System.out.println(" ".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void demo3() {
		String regex="\\s";
		System.out.println(" ".matches(regex));
		System.out.println("	".matches(regex));//一个tab键
		System.out.println("    ".matches(regex));//四个空格
	}

	private static void demo2() {
		String regex="\\D";
		System.out.println("0".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo1() {
		String regex="\\d";   //\代表转义字符，如果表示\d，需要\\d
		System.out.println("0".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("9".matches(regex));
	}

	private static void demo() {
		String regex="..";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
	}
}
