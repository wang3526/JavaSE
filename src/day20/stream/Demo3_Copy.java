package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		
		//�ڶ��ֿ���--���Ƽ�ʹ�ã���Ϊ�п��ܻᵼ���ڴ����
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Music/��Ԭ�� - ����.mp3");//�������������󣬹���T��Ԭ�� - ����.mp3
		FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Music/copy1.mp3");
		//int len=fis.available();
		//System.out.println(len);
		
		byte[] arr=new byte[fis.available()];//�������ļ�һ����С���ֽ�����
		fis.read(arr);//���ļ��ϵ��ֽڶ�ȡ���ڴ���
		fos.write(arr);//���ֽ������е��ֽ�����д���ļ���
		
		fis.close();
		fos.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		//��һ�ֿ�����ʽ
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Music/��Ԭ�� - ����.mp3");//�������������󣬹���T��Ԭ�� - ����.mp3
		FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Music/copy.mp3");
		
		int b;
		while((b=fis.read())!=-1){     //���ϵĶ�ȡÿһ���ֽ�
			fos.write(b);        //��ÿһ���ֽ�ȡ��д��
		}
		
		fis.close();       //�����ͷ���Դ
		fos.close();
	}
	
	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("Tulips.jpg");//�������������󣬹���Tulips.jpg
		FileOutputStream fos=new FileOutputStream("copy.jpg");//������������󣬹���copy.jpg
		
		int b;
		while((b=fis.read())!=-1){     //���ϵĶ�ȡÿһ���ֽ�
			fos.write(b);        //��ÿһ���ֽ�ȡ��д��
		}
		
		fis.close();       //�����ͷ���Դ
		fos.close();
	}
}
