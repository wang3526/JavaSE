package day16.testdemo;

public class Demo_Replace {
	/**
	 * “蒹葭苍苍，白露为霜，所谓伊人，在水一方”,替换叠词为Java
	 * */
	public static void main(String[] args) {
		String str="蒹葭苍苍,白露为霜,所谓伊人,在水一方";
		String str1=str.replace("苍苍", "Java");
		System.out.println(str1);
		
		String regex="(.)\\1+";
		str1=str.replaceAll(regex, "Java");
		System.out.println(str1);
	}
}
