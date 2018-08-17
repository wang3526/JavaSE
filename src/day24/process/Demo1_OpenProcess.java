package day24.process;

import java.io.IOException;

public class Demo1_OpenProcess {
	/**
	 * Java中启动进程的两种方式
	 * 	1、通过Runtime类
	 * 	2、通过ProcessBuilder类
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		/*//通过Runtime
		Runtime time=Runtime.getRuntime();
		//打开进程
		time.exec("notepad");*/
		
		//通过进程生成器启动进程
		ProcessBuilder pb=new ProcessBuilder("notepad");
		//启动进程
		pb.start();
	}
}
