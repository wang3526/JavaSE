package day21.io;

import java.io.File; 

public class Demo03_Filter {
	/**
	 * 需求说明
		对d:/mydir1/mydir2目录下的文件后缀名为txt的文件进行显示输出。
		
		文件后缀名为txt的文件进行显示输出。
		分析：
		1、获取文件夹下所有文件和文件夹
		2、遍历
		3、判断文件是文件夹还是文件
		4、如果是文件，判断是不是以.java为后缀
		5、如果是文件夹，递归调用
	 * */
	public static void main(String[] args) {
		File dir=Demo02_FileAll.getDir();
		printFileByFilter(dir);
	}
	
	/**
	 * 打印后缀名为.java的文件
	 * 1、返回值类型void
	 * 2、参数列表File dir
	 * */
	public static void printFileByFilter(File dir){
		//1、获取文件夹下所有文件和文件夹
		File[] files=dir.listFiles();
		//2、遍历
		for (File file : files) {
			//3、判断文件是文件夹还是文件
			if(file.isFile()){
				//4、如果是文件，判断是不是以.java为后缀
				if(file.getName().endsWith(".java")){
					System.out.println(file.getAbsolutePath());
				}
			}else {
				printFileByFilter(file);
			}
		}
	}
}
