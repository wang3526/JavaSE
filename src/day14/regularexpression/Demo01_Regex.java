package day14.regularexpression;

public class Demo01_Regex {
	/**
	 * * A:Ԥ�����ַ���
		* . �κ��ַ���(���н���������ƥ��Ҳ���ܲ�ƥ��)
		* \d ���֣�[0-9]
		* \D �����֣�[^0-9]
		* \s �հ��ַ���[ \t\n\x0B\f\r]
		* \S �ǿհ��ַ���[^\s]
		* \w �����ַ���[a-zA-Z_0-9]
		* \W �ǵ����ַ���[^\w]
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
		System.out.println("	".matches(regex));//һ��tab��
		System.out.println("    ".matches(regex));//�ĸ��ո�
	}

	private static void demo2() {
		String regex="\\D";
		System.out.println("0".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo1() {
		String regex="\\d";   //\����ת���ַ��������ʾ\d����Ҫ\\d
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
