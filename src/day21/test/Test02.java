package day21.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
	/**
	 * ����һ���ļ�������������read(byte[] b)��������aaa.txt�ļ������ݴ�ӡ����(byte�����С����Ϊ5)
	 * 
	 * ������
	 * 1��read(byte[] b)���ֽ��������ķ���������FileInputStream������aaa.txt
	 * 2�������ڴ��������������������д���ڴ��������
	 * 3�������ֽ����飬����Ϊ5
	 * 4�����ڴ������������ȫ��ת��Ϊ�ַ�����ӡ
	 * 5���ر�������
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//1��read(byte[] b)���ֽ��������ķ���������FileInputStream������aaa.txt
		FileInputStream fis=new FileInputStream("aaa.txt");
		//2�������ڴ��������������������д���ڴ��������
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		//3�������ֽ����飬����Ϊ5
		byte[] arr=new byte[5];
		
		int len;
		while((len=fis.read(arr))!=-1){
			baos.write(arr,0,len);
			//System.out.println(new String(arr, 0, len));
		}
		//4�����ڴ������������ȫ��ת��Ϊ�ַ�����ӡ
		System.out.println(baos.toString());//��ʹû�е��ã��ײ�Ҳ��Ĭ�ϵ���toString����
		//5���ر�������
		fis.close();
		
	}
}
