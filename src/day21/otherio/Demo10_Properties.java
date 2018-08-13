package day21.otherio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Demo10_Properties {
	/**
	 * Properties��Hashtable������
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws  IOException {
		//demo1();
		//demo2();
		Properties prop=new Properties();
		System.out.println("��ȡǰ��"+prop);
		prop.load(new FileInputStream("config.properties"));
		System.out.println("��ȡ��"+prop);
		
		prop.setProperty("tel", "18988888888");
		
		//�ڶ������������������ļ��б�ģ�������������Դ�null
		prop.store(new FileOutputStream("config.properties"), null);
		System.out.println("��ȡ��"+prop);
	}

	private static void demo2() {
		Properties prop=new Properties();
		prop.setProperty("name", "����");
		prop.setProperty("tel", "18912134545");
		
		//System.out.println(prop);
		Enumeration<String> en=(Enumeration<String>)prop.propertyNames();
		while(en.hasMoreElements()){
			String key=en.nextElement();//��ȡProperties�е�ÿһ����
			String value=prop.getProperty(key);//���ݼ���ȡֵ
			System.out.println(key+"="+value);
		}
	}

	private static void demo1() {
		Properties prop=new Properties();
		prop.put("abc", 123);
		System.out.println(prop);
	}
}
