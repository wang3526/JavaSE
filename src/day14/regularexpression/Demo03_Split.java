package day14.regularexpression;

public class Demo03_Split {
	/**
	 * * A:������ʽ�ķָ��
			* String��Ĺ��ܣ�public String[] split(String regex)
		* B:������ʾ
			* ������ʽ�ķָ��
	* */
	public static void main(String[] args) {
		String s="С��.����.���.���";
		String[] arr=s.split("\\.");//ͨ��������ʽ�и���ʽ
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("11111111");
	}
}
