package day16.testdemo;

public class Demo_Replace {
	/**
	 * ������Բԣ���¶Ϊ˪����ν���ˣ���ˮһ����,�滻����ΪJava
	 * */
	public static void main(String[] args) {
		String str="����Բ�,��¶Ϊ˪,��ν����,��ˮһ��";
		String str1=str.replace("�Բ�", "Java");
		System.out.println(str1);
		
		String regex="(.)\\1+";
		str1=str.replaceAll(regex, "Java");
		System.out.println(str1);
	}
}
