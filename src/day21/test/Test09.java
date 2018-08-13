package day21.test;

import java.io.File;

public class Test09 {
	/**
	 * * ����:4,�Ӽ��̽���һ���ļ���·��,���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ, ����:
			aaa���ļ���,������bbb.txt,ccc.txt,ddd.txt��Щ�ļ�,��eee�������ļ���,
			eee����fff.txt��ggg.txt,��ӡ���㼶��
			
		������
		1����ȡ�����ļ����ļ��У����ص�File����
		2����������
		3���������ļ������ļ��У�����Ҫֱ�Ӵ�ӡ
		4��������ļ��еݹ����
	 * */
	public static void main(String[] args) {
		File dir=Test04.getDir();//��ȡ�ļ���·��
		printLev(dir,0);
	}

	public static void printLev(File dir,int lev) {
		//1�����ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ
		File[] subFiles=dir.listFiles();
		//2����������
		for (File subFile : subFiles) {
			for(int i=0;i<=lev;i++){
				System.out.print("\t");
			}
			//3���������ļ������ļ��У�����Ҫֱ�Ӵ�ӡ
			System.out.println(subFile);
			//4��������ļ��еݹ����
			if(subFile.isDirectory()){
				printLev(subFile,lev+1);
			}
		}
	}
	
	
}
