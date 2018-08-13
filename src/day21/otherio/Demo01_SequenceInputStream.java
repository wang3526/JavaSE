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
	 * 整合两个输入流
	 * SequenceInputStream(InputStream s1, InputStream s2);
			把两个字节输入流整合成一个字节输入流。两个流的输入操作变成了一个流的输入操作。
			注意：这两个流，谁放在前边，谁就先被输入。
			
		整合多个输入流
		SequenceInputStream(Enumeration<? extends InputStream> e);
		
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis1=new FileInputStream("aaa.txt");
		FileInputStream fis2=new FileInputStream("bbb.txt");
		FileInputStream fis3=new FileInputStream("ccc.txt");
		
		Vector<FileInputStream> v=new Vector<FileInputStream>();//创建集合对象
		v.add(fis1);//将流对象存储进去
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en=v.elements();
		SequenceInputStream sis=new SequenceInputStream(en);//将枚举中的输入流整合成一个
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
		FileInputStream fis1=new FileInputStream("aaa.txt");//创建字节输入流关联aaa.txt
		FileOutputStream fos=new FileOutputStream("ccc.txt");//创建字节输出流关联bbb.txt
		
		int b1;
		while((b1=fis1.read()) != -1){//不断的在aaa.txt读取字节
			fos.write(b1);//将读到的字节写到ccc.txt
		}
		fis1.close();      //关闭输入流
		
		FileInputStream fis2=new FileInputStream("bbb.txt");
		int b2;
		while((b2=fis2.read())!=-1){
			fos.write(b2);
		}
		fis2.close();
		fos.close();
	}
}
