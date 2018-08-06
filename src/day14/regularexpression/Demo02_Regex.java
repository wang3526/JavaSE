package day14.regularexpression;

public class Demo02_Regex {
	/**
	 * * A:Greedy ������ 
		* X? X��һ�λ�һ��Ҳû��
		* X* X����λ���
		* X+ X��һ�λ���
		* X{n} X��ǡ�� n �� 
		* X{n,} X������ n �� 
		* X{n,m} X������ n �Σ����ǲ����� m �� 
	 * */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		String regex="[abc]{5,10}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcacbacba".matches(regex));
		System.out.println("abca".matches(regex));
		System.out.println("abcacbcbacbacbca".matches(regex));
	}

	private static void demo5() {
		String regex="[abc]{5,}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcacbacba".matches(regex));
		System.out.println("abca".matches(regex));
	}

	private static void demo4() {
		String regex="[abc]{5}";
		System.out.println("abcba".matches(regex));
		System.out.println("abcacbacba".matches(regex));
		System.out.println("abca".matches(regex));
	}

	private static void demo3() {
		String regex="[abc]+";
		System.out.println("".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("abc".matches(regex));
	}

	private static void demo2() {
		String regex="[abc]*";
		System.out.println("".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void demo1() {
		String regex="[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("".matches(regex));
	}
}
