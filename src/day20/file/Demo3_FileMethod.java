package day20.file;

import java.io.File;

public class Demo3_FileMethod {
	/**
	 * * A:��������ɾ������
			* public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
			* public boolean delete():ɾ���ļ������ļ���
		* B:������ע������
			* ���·������ͬ�����Ǹ�����
			* ���·������ͬ�����Ǹ��������С�
		* C:ɾ��ע�����
			* Java�е�ɾ�����߻���վ��
			* Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
	 * */
	public static void main(String[] args) {
		//demo1();
		File file=new File("yyy.txt");
		System.out.println(file.delete());
		
		File file2=new File("aaa");
		System.out.println(file2.delete());
		
		File file3=new File("ccc");//���ɾ��һ���ļ��У��ļ��б����ǿյ�
		System.out.println(file3.delete());
	}

	private static void demo1() {
		File file1=new File("xxx.txt");
		File file2=new File("ooo.txt");
		System.out.println(file1.renameTo(file2));
	}
}
