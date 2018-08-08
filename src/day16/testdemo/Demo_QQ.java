package day16.testdemo;

public class Demo_QQ {
	/**
	 * QQ号验证
	 * 
	 * 分析：
	 * 1、数字
	 * 2、第一位不能是0
	 * 3、必须是5-11位的
	 * */
	public static void main(String[] args) {
		String str="04145769";
		if(str.length()>=5&&str.length()<=11){
			char[] arr=str.toCharArray();
			for (int i = 1; i < arr.length; i++) {
				if(!(arr[0]==0&&arr[i]>='0'&&arr[i]<='9')){
					System.out.println("QQ号错误");
					break;
				}else if(i==arr.length-1){
					System.out.println("QQ号码正确");
				}
			}
		}else {
			System.out.println("QQ号码错误");
		}
	}
}
