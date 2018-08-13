package day20.test;

import java.io.File;
import java.util.Scanner;

public class Test8 {
	/**
	 * * ����:�Ӽ����������һ���ļ���·��,��ӡ�����ļ��������е�.java�ļ���
	 * 
	 * ������
	 * �Ӽ��̽���һ���ļ���·��
	 * 1�����¼����ǲ����ڵģ�������ʾ
	 * 2�����¼������ļ�·����������ʾ
	 * 3��������ļ���·����ֱ�ӷ���
	 * 
	 * ��ӡ�����ļ��������еġ�java�ļ���
	 * 1����ȡ�����ļ���·���µ������ļ����ļ��У��洢��File������
	 * 2���������飬��ÿһ���ļ����ļ����ж�
	 * 3��������ļ������Һ�׺�ǡ�java�ģ��ʹ�ӡ
	 * 4��������ļ��У��͵ݹ����
	 * */
	public static void main(String[] args) {
		File dir=getDir();
		printJavaFile(dir);
	}
	
	/**
	 * ��ȡ����¼����ļ���·��
	 * 1������ֵ����File
	 * 2������Ҫ����
	 * */
	public static File getDir(){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ļ���·��");
		while(true){
			String line=sc.nextLine();//������¼����ļ���·�����д洢
			File dir=new File(line);//��װ��File����
			if(!dir.exists()){
				System.out.println("��¼����ļ���·�������ڣ�������¼��");
			}else if (dir.isFile()) {
				System.out.println("��¼������ļ�·����������¼���ļ���·��");
			}else {
				return dir;
			}
		}
	}
	
	/**
	 * ��ȡ�ļ���·���µ�����.java�ļ�
	 * 1������ֵ����void
	 * 2�������б�File dir
	 * */
	public static void printJavaFile(File dir){
		//1����ȡ�����ļ���·���µ������ļ����ļ��У��洢��File������
		File[] files=dir.listFiles();
		//2���������飬��ÿһ���ļ����ļ����ж�
		for (File file : files) {
			//3��������ļ������Һ�׺�ǡ�java�ģ��ʹ�ӡ
			if(file.isFile()&&file.getName().endsWith(".java")){
				System.out.println(file);
				//4��������ļ��У��͵ݹ����
			}else if(file.isDirectory()){
				printJavaFile(file);
			}
		}
	}
}
