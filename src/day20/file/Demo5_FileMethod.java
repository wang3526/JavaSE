package day20.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {
	/**
	 * * A:��ȡ����
			* public String getAbsolutePath()����ȡ����·��
			* public String getPath():��ȡ·��
			* public String getName():��ȡ����
			* public long length():��ȡ���ȡ��ֽ���
			* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
			* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
			* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
		* B:������ʾ
			* File��Ļ�ȡ����
	 * */
	public static void main(String[] args) {
		//demo1();
		File dir=new File("D:\\Java�ܽ�\\�ܽ�");
		String[] arr=dir.list();//��Ϊ�˻�ȡ�ļ���
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles=dir.listFiles();//��ȡ�ļ�����
		for (File file : subFiles) {
			System.out.println(file);
		}
	}

	private static void demo1() {
		File file=new File("aaa.txt");
		File file2=new File("D:\\myeclipse\\workspace\\JavaSE\\aaa.txt");
		//System.out.println(file.getAbsolutePath());//��ȡ����·��
		//System.out.println(file2.getAbsolutePath());
		
		//System.out.println(file.getPath());//��ȡ���췽���д����·��
		//System.out.println(file2.getPath());
		
		/*System.out.println(file.getName());//��ȡ�ļ����ļ��е�����
		System.out.println(file2.getName());
		
		System.out.println(file.length());*/
		
		Date date=new Date(file.lastModified());//�ļ�������޸�ʱ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss:SSS");
		System.out.println(sdf.format(date));
	}
}
