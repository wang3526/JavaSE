package day21.io;

import java.io.File;
import java.util.Scanner;

public class Demo02_FileAll {
	/**
	 *需求说明
		列出指定目录中所有的文件,包括子文件夹中的所有文件(使用递归算法(recursion)).
		
		分析：
		列出指定目录中所有的文件
		1、创建键盘录入对象Scanner
		2、无限循环录入文件夹路径
		3、接收键盘录入的路径
		4、将录入的路径转换成文件对象
		5、判断是否是文件夹，如果是文件夹返回
		6、如果不是，输出提示信息
		
		包括子文件夹中的所有文件
		1、获取文件夹下的所有文件和文件夹
		2、遍历
		3、判断是文件还是文件夹
		4、如果是文件，打印文件路径
		5、如果是文件夹，递归调用
		
	 * */
	public static void main(String[] args) {
		File dir=getDir();
		printFile(dir);
	}
	
	/**
	 * 获取文件夹对象
	 * 1、返回值类型File
	 * 2、参数列表无
	 * */
	public static File getDir(){
		//1、创建键盘录入对象Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个文件夹路径：");
		//2、无限循环录入文件夹路径
		while(true){
			//3、接收键盘录入的路径
			String line=sc.nextLine();
			//4、将录入的路径转换成文件对象
			File dir=new File(line);
			//5、判断是否是文件夹，如果是文件夹返回
			if(!dir.exists()){//判断文件夹是否存在
				System.out.println("文件夹路径不存在，请重新输入一个文件夹路径：");
			}else if(dir.isFile()){//判断是否是文件
				System.out.println("你输入的是文件路径，请重新输入一个文件夹路径：");
			}else {
				return dir;
			}
		}
	}
	
	/**
	 * 列出指定目录中所有的文件,包括子文件夹中的所有文件
	 * 1、返回值类型void
	 * 2、参数列表File dir
	 * */
	public static void printFile(File dir){
		//1、获取文件夹下的所有文件和文件夹
		File[] files=dir.listFiles();
		//2、遍历
		for (File file : files) {
			//3、判断是文件还是文件夹
			if(file.isFile()){
				//4、如果是文件，打印文件路径
				System.out.println(file.getAbsolutePath());
			}else {
				//5、如果是文件夹，递归调用
				printFile(file);
			}
		}
	}
}
