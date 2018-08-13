package day21.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {
	/**
	 * * 需求:3,从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	 * 
	 * 把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	 * 分析：
	 * 1、在目标文件夹中创建文件夹
	 * 2、获取原文件夹中所有的文件和文件夹，存储在File数组中
	 * 3、遍历数组
	 * 4、如果是文件就io流读写
	 * 5、如果是文件夹就递归调用
	 * @throws IOException 
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		File src=Test04.getDir();
		File dest=Test04.getDir();
		if(src.equals(dest)){
			System.out.println("目标文件夹是源文件夹的子文件夹");
		}else {
			copy(src,dest);
		}
		
	}
	
	/**
	 * 把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	 * 1、返回值类型void
	 * 2、参数列表File src,File dest
	 * @throws IOException 
	 * */
	public static void copy(File src, File dest) throws IOException {
		//1、在目标文件夹中创建文件夹
		File newDir=new File(dest,src.getName());
		newDir.mkdir();
		//2、获取原文件夹中所有的文件和文件夹，存储在File数组中
		File[] subFiles=src.listFiles();
		//3、遍历数组
		for (File subFile : subFiles) {
			if(subFile.isFile()){
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos=
						new BufferedOutputStream(new FileOutputStream(new File(newDir, subFile.getName())));
				int b;
				while((b=bis.read())!=-1){
					bos.write(b);
				}
				
				bis.close();
				bos.close();
			}else {
				copy(subFile, newDir);
			}
		}
		
	}
}
