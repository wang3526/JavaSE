package day16.testdemo;

public class Demo_Phone {
	/**
	 * 手机号码验证
	 * 
	 * 分析
	 * 1、11位
	 * 2、第一位是1，第二位是3、5、8，其余9位是0-9任意数字
	 * */
	public static void main(String[] args) {
		String str="18937576793";
		if(str.length()==11){
			char[] arr=str.toCharArray();//转换成字符数组
			for (int i = 2; i < arr.length; i++) {
				if(!(arr[0]=='1'&&(arr[1]=='3'||arr[1]=='5'||arr[1]=='8')&&(arr[i]>='0'&&arr[i]<='9'))){
					System.out.println("手机号错误");
					break;
				}else if(i==arr.length-1){
					System.out.println("手机号正确");
				}
			}
		}else{
			System.out.println("手机号错误");
		}
	}
}
