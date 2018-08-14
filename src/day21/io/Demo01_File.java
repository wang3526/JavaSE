package day21.io;

import java.io.File;

public class Demo01_File {
	public static void main(String[] args) {
		//1、拼接字符串路径
		String path="C:\\Users\\Administrator\\Desktop\\gitee.txt";
		//2、将字符串路径，转换成File对象
		File file=new File(path);
		//3、读取文件属性信息
		//读取文件名称
		System.out.println("文件名："+file.getName());
		//获取文件的绝对路径
		System.out.println("绝对路径："+file.getAbsolutePath());
		//获取文件的相对路径
		System.out.println("相对路径："+file.getPath());
		//返回父目录
		System.out.println("父目录："+file.getParent());
		//返回文件分区大小,返回的是字节   kb  Mb  Gb
		System.out.println("分区大小："+file.getTotalSpace());
		//返回所在分区可用字节数
		System.out.println("分区可用字节："+file.getFreeSpace());
		//判断文件是否是绝对路径
		System.out.println("是否是绝对路径："+file.isAbsolute());
		//判断当前文件是否是一个文件
		System.out.println("是否是文件："+file.isFile());
		
	}
}
