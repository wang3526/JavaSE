package day21.test;

import java.io.File;

public class Test09 {
	/**
	 * * 需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印, 例如:
			aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,
			eee中有fff.txt和ggg.txt,打印出层级来
			
		分析：
		1、获取所有文件和文件夹，返回的File数组
		2、遍历数组
		3、无论是文件还是文件夹，都需要直接打印
		4、如果是文件夹递归调用
	 * */
	public static void main(String[] args) {
		File dir=Test04.getDir();//获取文件夹路径
		printLev(dir,0);
	}

	public static void printLev(File dir,int lev) {
		//1、把文件夹中的所有文件以及文件夹的名字按层级打印
		File[] subFiles=dir.listFiles();
		//2、遍历数组
		for (File subFile : subFiles) {
			for(int i=0;i<=lev;i++){
				System.out.print("\t");
			}
			//3、无论是文件还是文件夹，都需要直接打印
			System.out.println(subFile);
			//4、如果是文件夹递归调用
			if(subFile.isDirectory()){
				printLev(subFile,lev+1);
			}
		}
	}
	
	
}
