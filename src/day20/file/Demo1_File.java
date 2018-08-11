package day20.file;

import java.io.File;

public class Demo1_File {
	/**
	 * * B:构造方法
		* File(String pathname)：根据一个路径得到File对象
		* File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
		* File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
	 * */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		File parent=new File("C:\\Users\\Administrator\\Desktop");
		String child="gitee.txt";
		File file=new File(parent, child);
		System.out.println(file.exists());
	}

	private static void demo2() {
		String parent="C:\\Users\\Administrator\\Desktop";
		String child="gitee.txt";
		File file=new File(parent,child);
		System.out.println(file.exists());
	}

	private static void demo1() {
		File file=new File("C:\\Users\\Administrator\\Desktop\\gitee.txt");
		System.out.println(file.exists());
		
		File file2=new File("xxx.txt");
		System.out.println(file2.exists());
		
		File file3=new File("yyy.txt");
		System.out.println(file3.exists());
	}
}
