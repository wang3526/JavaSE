package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {
	/**
	 * * read()������ȡ����һ���ֽ�,Ϊʲô������int,������byte
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis=new FileInputStream("aaa.txt");//����������
		int b;
		while((b=fis.read()) != -1){
			System.out.println(b);
		}
		
		fis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("aaa.txt");//����������
		int x=fis.read();//��Ӳ���϶�ȡһ���ֽ�
		System.out.println(x);
		
		int y=fis.read();
		System.out.println(y);
		
		int z=fis.read();
		System.out.println(z);
		
		int a=fis.read();
		System.out.println(a);
		fis.close();//�����ͷ���Դ
	}
}
