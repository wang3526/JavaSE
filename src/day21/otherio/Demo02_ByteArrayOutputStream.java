package day21.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02_ByteArrayOutputStream {
	/**
	 * ByteArrayOutputStream
	 * �ڴ������
	 * 
	 * FileInputStream��ȡ���ĵ�ʱ�����������
	 * 
	 * �������
	 * 1���ַ�����ȡ
	 * 2��ByteArrayOutputStream
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis=new FileInputStream("aaa.txt");
		ByteArrayOutputStream baos=new ByteArrayOutputStream();//���ڴ��д��������������ڴ�����
		int b;
		while((b=fis.read())!=-1){
			baos.write(b);//����ȡ�����������д���ڴ���
		}
		
		//byte[] arr=baos.toByteArray();//��������������ȫ����ȡ����������ֵ��arr����
		//System.out.println(new String(arr));
		
		System.out.println(baos.toString());//��������������ת�����ַ��������������п���ʡ�Ե���toString����
		
		fis.close();
		
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("aaa.txt");
		byte[] arr=new byte[3];
		
		int len;
		while((len=fis.read(arr))!=-1){
			System.out.println(new String(arr));
		}
		
		fis.close();
	}
}
