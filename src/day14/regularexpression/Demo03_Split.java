package day14.regularexpression;

public class Demo03_Split {
	/**
	 * * A:正则表达式的分割功能
			* String类的功能：public String[] split(String regex)
		* B:案例演示
			* 正则表达式的分割功能
	* */
	public static void main(String[] args) {
		String s="小乔.大乔.周瑜.孙策";
		String[] arr=s.split("\\.");//通过正则表达式切割表达式
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("11111111");
	}
}
