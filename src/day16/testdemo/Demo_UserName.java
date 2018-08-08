package day16.testdemo;

public class Demo_UserName {
	/**
	 * 用户名必须是6-16位，可以是字母数字下划线
	 * */
	public static void main(String[] args) {
		String userName="qWewrw_435672345";
		if(userName.length()>=6 && userName.length()<=16){
			char[] arr=userName.toCharArray(); //装换成字符数组
			for (int i = 0; i < arr.length; i++) {
				if(!(arr[i]=='_'||arr[i]>='0'&&arr[i]<='9'||arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z')){
					System.out.println("用户名错误");
					break;
				}else if(i==arr.length-1){
					System.out.println("用户名正确");
					
				}
			}
		}else{
			System.out.println("格式错误");
		}
	}
}
