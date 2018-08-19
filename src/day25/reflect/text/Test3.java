package day25.reflect.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
	/**
	 * * 已知一个类，定义如下： 
	 * package cn.itcast.heima;
	 * 		public class DemoClass {
				public void run() {
					System.out.println("welcome to heima!");
				}
			}
	 * (1) 写一个Properties格式的配置文件，配置类的完整名称。 
	 * (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法。
	 * @throws Exception 

	 * */
	public static void main(String[] args) throws Exception {
		//创建输入流，关联xxx.properties
		BufferedReader br=new BufferedReader(new FileReader("xxx.properties"));
		//读取配置文件中的类名，获取字节码对象
		Class clazz=Class.forName(br.readLine());
		
		DemoClass dc=(DemoClass)clazz.newInstance();   //通过字节码对象创建对象
		dc.run();
		
	}
}
