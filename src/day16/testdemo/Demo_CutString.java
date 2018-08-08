package day16.testdemo;

public class Demo_CutString {
	/**
	 * “蒹葭苍苍，白露为霜，所谓伊人，在水一方”,以逗号分割字符串
	 * */
	public static void main(String[] args) {
		String str="蒹葭苍苍,白露为霜,所谓伊人,在水一方";
		String[] arr=str.split(",");
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
