package day14.regularexpression;

public class Demo04_ReplaceAll {
	/**
	 * * A:������ʽ���滻����
			* String��Ĺ��ܣ�public String replaceAll(String regex,String replacement)
		* B:������ʾ
			* ������ʽ���滻����
	 * */
	public static void main(String[] args) {
		String s="wo1ai2heima";
		String regex="\\d";  //\\d������������
		
		String s2=s.replaceAll(regex, "");
		System.out.println(s2);
	}
}
