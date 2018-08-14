package day21.io;

import java.io.File;
import java.util.Scanner;

public class Demo02_FileAll {
	/**
	 *����˵��
		�г�ָ��Ŀ¼�����е��ļ�,�������ļ����е������ļ�(ʹ�õݹ��㷨(recursion)).
		
		������
		�г�ָ��Ŀ¼�����е��ļ�
		1����������¼�����Scanner
		2������ѭ��¼���ļ���·��
		3�����ռ���¼���·��
		4����¼���·��ת�����ļ�����
		5���ж��Ƿ����ļ��У�������ļ��з���
		6��������ǣ������ʾ��Ϣ
		
		�������ļ����е������ļ�
		1����ȡ�ļ����µ������ļ����ļ���
		2������
		3���ж����ļ������ļ���
		4��������ļ�����ӡ�ļ�·��
		5��������ļ��У��ݹ����
		
	 * */
	public static void main(String[] args) {
		File dir=getDir();
		printFile(dir);
	}
	
	/**
	 * ��ȡ�ļ��ж���
	 * 1������ֵ����File
	 * 2�������б���
	 * */
	public static File getDir(){
		//1����������¼�����Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		//2������ѭ��¼���ļ���·��
		while(true){
			//3�����ռ���¼���·��
			String line=sc.nextLine();
			//4����¼���·��ת�����ļ�����
			File dir=new File(line);
			//5���ж��Ƿ����ļ��У�������ļ��з���
			if(!dir.exists()){//�ж��ļ����Ƿ����
				System.out.println("�ļ���·�������ڣ�����������һ���ļ���·����");
			}else if(dir.isFile()){//�ж��Ƿ����ļ�
				System.out.println("����������ļ�·��������������һ���ļ���·����");
			}else {
				return dir;
			}
		}
	}
	
	/**
	 * �г�ָ��Ŀ¼�����е��ļ�,�������ļ����е������ļ�
	 * 1������ֵ����void
	 * 2�������б�File dir
	 * */
	public static void printFile(File dir){
		//1����ȡ�ļ����µ������ļ����ļ���
		File[] files=dir.listFiles();
		//2������
		for (File file : files) {
			//3���ж����ļ������ļ���
			if(file.isFile()){
				//4��������ļ�����ӡ�ļ�·��
				System.out.println(file.getAbsolutePath());
			}else {
				//5��������ļ��У��ݹ����
				printFile(file);
			}
		}
	}
}
