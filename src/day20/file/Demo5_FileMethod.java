package day20.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {
	/**
	 * * A:获取功能
			* public String getAbsolutePath()：获取绝对路径
			* public String getPath():获取路径
			* public String getName():获取名称
			* public long length():获取长度。字节数
			* public long lastModified():获取最后一次的修改时间，毫秒值
			* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
			* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
		* B:案例演示
			* File类的获取功能
	 * */
	public static void main(String[] args) {
		//demo1();
		File dir=new File("D:\\Java总结\\总结");
		String[] arr=dir.list();//仅为了获取文件名
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles=dir.listFiles();//获取文件对象
		for (File file : subFiles) {
			System.out.println(file);
		}
	}

	private static void demo1() {
		File file=new File("aaa.txt");
		File file2=new File("D:\\myeclipse\\workspace\\JavaSE\\aaa.txt");
		//System.out.println(file.getAbsolutePath());//获取绝对路径
		//System.out.println(file2.getAbsolutePath());
		
		//System.out.println(file.getPath());//获取构造方法中传入的路径
		//System.out.println(file2.getPath());
		
		/*System.out.println(file.getName());//获取文件或文件夹的名字
		System.out.println(file2.getName());
		
		System.out.println(file.length());*/
		
		Date date=new Date(file.lastModified());//文件的最后修改时间
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS");
		System.out.println(sdf.format(date));
	}
}
