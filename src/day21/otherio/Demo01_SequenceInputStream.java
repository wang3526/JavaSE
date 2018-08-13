package day21.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo01_SequenceInputStream {
	/**
	 * ��������������
	 * SequenceInputStream(InputStream s1, InputStream s2);
			�������ֽ����������ϳ�һ���ֽ�����������������������������һ���������������
			ע�⣺����������˭����ǰ�ߣ�˭���ȱ����롣
			
		���϶��������
		SequenceInputStream(Enumeration<? extends InputStream> e);
		
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis1=new FileInputStream("aaa.txt");
		FileInputStream fis2=new FileInputStream("bbb.txt");
		FileInputStream fis3=new FileInputStream("ccc.txt");
		
		Vector<FileInputStream> v=new Vector<FileInputStream>();//�������϶���
		v.add(fis1);//��������洢��ȥ
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en=v.elements();
		SequenceInputStream sis=new SequenceInputStream(en);//��ö���е����������ϳ�һ��
		FileOutputStream fos=new FileOutputStream("ddd.txt");
		
		int b;
		while((b=sis.read())!=-1){
			fos.write(b);
		}
		
		sis.close();
		fos.close();
		
		
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis1=new FileInputStream("aaa.txt");
		FileInputStream fis2=new FileInputStream("bbb.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
		FileOutputStream fos=new FileOutputStream("ccc.txt");
		
		int b;
		while((b=sis.read())!=-1){
			fos.write(b);
		}
		
		sis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis1=new FileInputStream("aaa.txt");//�����ֽ�����������aaa.txt
		FileOutputStream fos=new FileOutputStream("ccc.txt");//�����ֽ����������bbb.txt
		
		int b1;
		while((b1=fis1.read()) != -1){//���ϵ���aaa.txt��ȡ�ֽ�
			fos.write(b1);//���������ֽ�д��ccc.txt
		}
		fis1.close();      //�ر�������
		
		FileInputStream fis2=new FileInputStream("bbb.txt");
		int b2;
		while((b2=fis2.read())!=-1){
			fos.write(b2);
		}
		fis2.close();
		fos.close();
	}
}
