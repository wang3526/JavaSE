package day25.reflect.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
	/**
	 * * ��֪һ���࣬�������£� 
	 * package cn.itcast.heima;
	 * 		public class DemoClass {
				public void run() {
					System.out.println("welcome to heima!");
				}
			}
	 * (1) дһ��Properties��ʽ�������ļ�����������������ơ� 
	 * (2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬�÷���ķ�ʽ����run������
	 * @throws Exception 

	 * */
	public static void main(String[] args) throws Exception {
		//����������������xxx.properties
		BufferedReader br=new BufferedReader(new FileReader("xxx.properties"));
		//��ȡ�����ļ��е���������ȡ�ֽ������
		Class clazz=Class.forName(br.readLine());
		
		DemoClass dc=(DemoClass)clazz.newInstance();   //ͨ���ֽ�����󴴽�����
		dc.run();
		
	}
}
