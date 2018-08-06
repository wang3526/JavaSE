package day14.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo06_Pattern {
	/**
	 * * A:Pattern��Matcher�ĸ���
		* B:ģʽ��ƥ�����ĵ��͵���˳��
			* ͨ��JDK�ṩ��API���鿴Pattern���˵��
		
			* ���͵ĵ���˳���� 
			* Pattern p = Pattern.compile("a*b");
			* Matcher m = p.matcher("aaaaab");
			* boolean b = m.matches();
			* 
			* * A:������ʽ�Ļ�ȡ����
					* Pattern��Matcher�Ľ��ʹ��
				* B:������ʾ
					* ���󣺰�һ���ַ����е��ֻ������ȡ����
			* 
	 * */
	public static void main(String[] args) {
		 //demo();
		String s1="�ҵ��ֻ���13546878957�������ù�15789956845�����ù�18869754785";
		String regex="1[3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s1);
	/*	boolean b1=m.find();
		System.out.println(b1);
		System.out.println(m.group());
		
		boolean b2=m.find();
		System.out.println(b2);
		System.out.println(m.group());*/
		while (m.find()) {
			System.out.println(m.group());	
		}
	}

	private static void demo() {
		Pattern p = Pattern.compile("a*b");//��ȡ��������ʽ
		 Matcher m = p.matcher("aaaaab"); //��ȡƥ����
		 boolean b = m.matches(); //���Ƿ���ƥ�䣬ƥ��ͷ���true
		 
		 System.out.println(b);
		 System.out.println("aaaaab".matches("a*b"));//������Ľ��һ��
	}
}
