package day16.testdemo;

public class Demo_CutString {
	/**
	 * ������Բԣ���¶Ϊ˪����ν���ˣ���ˮһ����,�Զ��ŷָ��ַ���
	 * */
	public static void main(String[] args) {
		String str="����Բ�,��¶Ϊ˪,��ν����,��ˮһ��";
		String[] arr=str.split(",");
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
