package day21.io;

import java.io.File;

public class Demo04_RenameTo {
	/**
	 *需求说明
		批量修改文件名称
		
	分析：
		1、获取文件夹中所有文件和文件夹对象
		2、遍历
		3、判断是否是文件
		4、如果是文件，修改文件名
		5、如果不是，递归调用
	 * */
	public static void main(String[] args) {
		File dir=Demo02_FileAll.getDir();
		rename(dir);
	}
	
	/**
	 * 批量修改文件名
	 * 1、返回值类型void
	 * 2、参数列表File dir
	 * */
	public static void rename(File dir){
		int count=0;
		//1、获取文件夹中所有文件和文件夹对象
		File[] files=dir.listFiles();
		//2、遍历
		for(int i=0;i<files.length;i++){
			//3、判断是否是文件
			if(files[i].isFile()){
				//4、如果是文件，修改文件名
				files[i].renameTo(new File(files[i].getParent()+File.separator+"code"+count+".txt"));
				count++;
			}else {
				//5、如果不是，递归调用
				rename(files[i]);
			}
		}
	}
}
