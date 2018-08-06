package day12.string;

import java.util.Scanner;

public class Test1 {
	/**
	 * 模拟登录
	 * 需求：给三次机会，并提示还有几次
	 * 用户名和密码都是admin
	 * 分析：
	 * 1、模拟登录，需要键盘录入，Scanner
	 * 2、给三次机会，需要循环，for
	 * 3、并提示还有几次，需要判断，if
	 * */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("请输入用户名：");
			String userName=scanner.nextLine();
			System.out.println("请输入密码：");
			String pwd=scanner.nextLine();
			//如果是字符常常量和字符常变量比较，通常都是字符串常量调用
			//方法，将变量当作参数传递，防止空指针异常
			if("admin".equals(pwd)&&"admin".equals(userName)){
				System.out.println("欢迎"+userName+"登录");
				break;
			}else{
				if(i==3){
					System.out.println("你的录入次数以到，请明天再来");	
				}else{
					System.out.println("用户名或密码错误！还有"+(3-i)+"次机会！");
				}
			}		
		}
	}
}
