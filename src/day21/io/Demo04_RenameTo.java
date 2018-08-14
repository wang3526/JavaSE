package day21.io;

import java.io.File;

public class Demo04_RenameTo {
	/**
	 *����˵��
		�����޸��ļ�����
		
	������
		1����ȡ�ļ����������ļ����ļ��ж���
		2������
		3���ж��Ƿ����ļ�
		4��������ļ����޸��ļ���
		5��������ǣ��ݹ����
	 * */
	public static void main(String[] args) {
		File dir=Demo02_FileAll.getDir();
		rename(dir);
	}
	
	/**
	 * �����޸��ļ���
	 * 1������ֵ����void
	 * 2�������б�File dir
	 * */
	public static void rename(File dir){
		int count=0;
		//1����ȡ�ļ����������ļ����ļ��ж���
		File[] files=dir.listFiles();
		//2������
		for(int i=0;i<files.length;i++){
			//3���ж��Ƿ����ļ�
			if(files[i].isFile()){
				//4��������ļ����޸��ļ���
				files[i].renameTo(new File(files[i].getParent()+File.separator+"code"+count+".txt"));
				count++;
			}else {
				//5��������ǣ��ݹ����
				rename(files[i]);
			}
		}
	}
}
