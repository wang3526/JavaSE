package day20.test;

import java.io.File;
import java.io.FilenameFilter;

public class Test1 {
	/**
	 * * A:������ʾ
			* �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
	 * */
	public static void main(String[] args) {
		File dir=new File("D:\\");
		
		/*String[] arr=dir.list();//��ȡD�������е��ļ����ļ���
		for (String string : arr) {
			if(string.endsWith(".jpg")){
				System.out.println(string);
			}
		}*/
		
		/*File[] subFiles=dir.listFiles();//��ȡD���������ļ����ļ��ж���
		for (File file : subFiles) {
			if(file.isFile()&&file.getName().endsWith(".jpg")){
				System.out.println(file);
			}
		}*/
		
		String[] arr=dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//System.out.println(dir);
				//System.out.println(name);
				File file=new File(dir, name);
				return file.isFile()&&file.getName().endsWith(".jpg");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
		
	}
}
