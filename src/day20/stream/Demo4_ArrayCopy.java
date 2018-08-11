package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {
	/**
	 * �����ֿ���
	 * ���������
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Music/��Ԭ�� - ����.mp3");//�������������󣬹���T��Ԭ�� - ����.mp3
		FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Music/copy1.mp3");
		
		byte[] arr=new byte[1024*8];
		int len;
		while((len=fis.read(arr))!=-1){
			fos.write(arr,0,len);
		}
		
		fis.close();
		fos.close();
		
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("yyy.txt");
		FileOutputStream fos=new FileOutputStream("xxx.txt");
		
		byte[] arr=new byte[2];
		int len;
		while((len=fis.read(arr))!=-1){
			fos.write(arr,0,len);
		}
		
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("yyy.txt");
		byte[] arr=new byte[2];
		int a=fis.read(arr);//���ļ��ϵ��ֽڶ�ȡ���ֽ�������
		
		System.out.println(a);//��������Ч���ֽڸ���
		for (byte b : arr) {//��һ�λ�ȡ���ļ��ϵ�d��a
			System.out.println(b);
		}
		System.out.println("---------------");
		int b=fis.read(arr);
		System.out.println(b);
		for (byte b1 : arr) {
			System.out.println(b1);
		}
		fis.close();
	}
}
