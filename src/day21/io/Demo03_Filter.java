package day21.io;

import java.io.File; 

public class Demo03_Filter {
	/**
	 * ����˵��
		��d:/mydir1/mydir2Ŀ¼�µ��ļ���׺��Ϊtxt���ļ�������ʾ�����
		
		�ļ���׺��Ϊtxt���ļ�������ʾ�����
		������
		1����ȡ�ļ����������ļ����ļ���
		2������
		3���ж��ļ����ļ��л����ļ�
		4��������ļ����ж��ǲ�����.javaΪ��׺
		5��������ļ��У��ݹ����
	 * */
	public static void main(String[] args) {
		File dir=Demo02_FileAll.getDir();
		printFileByFilter(dir);
	}
	
	/**
	 * ��ӡ��׺��Ϊ.java���ļ�
	 * 1������ֵ����void
	 * 2�������б�File dir
	 * */
	public static void printFileByFilter(File dir){
		//1����ȡ�ļ����������ļ����ļ���
		File[] files=dir.listFiles();
		//2������
		for (File file : files) {
			//3���ж��ļ����ļ��л����ļ�
			if(file.isFile()){
				//4��������ļ����ж��ǲ�����.javaΪ��׺
				if(file.getName().endsWith(".java")){
					System.out.println(file.getAbsolutePath());
				}
			}else {
				printFileByFilter(file);
			}
		}
	}
}
