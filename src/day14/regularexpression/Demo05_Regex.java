package day14.regularexpression;

public class Demo05_Regex {
	/**
	 * * A:������ʽ�ķ��鹦��
			* ���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺 
		* 
				1     ((A)(B(C))) 
				2     (A 
				3     (B(C)) 
				4     (C) 
			
				����ʼ�մ����������ʽ��
		* B:������ʾ
			a:�и�
				�����밴�յ����и "sdqqfgkkkhjppppkl";
			b:�滻
				��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
				���ַ�����ԭ��:����Ҫѧ��̡���
	 * */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		/*	b:�滻
			��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
			���ַ�����ԭ��:����Ҫѧ��̡���*/
		String s1="����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String s2=s1.replaceAll("\\.", "");
		System.out.println(s2);
		String s3=s2.replaceAll("(.)\\1+", "$1");//$1�����һ���е�����
		System.out.println(s3);
	}

	private static void demo3() {
		//�����밴�յ����и "sdqqfgkkkhjppppkl";
		String regex="(.)\\1+"; //+�����һ�����һ�ε����
		String s1="sdqqfgkkkhjppppkl";
		String[] s2=s1.split(regex);
		for (String string : s2) {
			System.out.println(string);
		}
	}

	private static void demo2() {
		//���� ���˸���
		String regex="(..)\\1";
		System.out.println("��������".matches(regex));
		System.out.println("���˸���".matches(regex));
		System.out.println("�������".matches(regex));
	}

	private static void demo1() {
		//����   ������֣��߸�����
		String regex="(.)\\1(.)\\2";  //\\1�����һ���ֳ���һ��,\\2����ڶ����ֳ���һ��
		System.out.println("�������".matches(regex));
		System.out.println("��������".matches(regex));
	}
}
