package day13.demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str={"语文","数学","英语"};
		try{
			System.out.println("请输入1-3之间的数字：");
			int i=sc.nextInt();
			System.out.println(i+"对应的课程为："+str[i-1]);
		}catch(Exception e){
			System.out.println("输入错误！");
		}finally{
			System.out.println("欢迎提出建议！");
		}
	}
}
