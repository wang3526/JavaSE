package day14.regularexpression;

public class Demo04_ReplaceAll {
	/**
	 * * A:正则表达式的替换功能
			* String类的功能：public String replaceAll(String regex,String replacement)
		* B:案例演示
			* 正则表达式的替换功能
	 * */
	public static void main(String[] args) {
		String s="wo1ai2heima";
		String regex="\\d";  //\\d代表任意数字
		
		String s2=s.replaceAll(regex, "");
		System.out.println(s2);
	}
}
