package day20.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2(); 
		//demo3();
		BufferedReader br=new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("yyy.txt"));
		
		int c;
		while((c=br.read())!=-1){
			bw.write(c);
		}
		
		br.close();
		bw.close();
	}

	private static void demo3() throws FileNotFoundException, IOException {
		FileReader fr=new FileReader("xxx.txt");
		FileWriter fw=new FileWriter("yyy.txt");
		
		char[] arr=new char[1024];
		int c;
		while((c=fr.read(arr))!=-1){//���ļ��ϵ����ݶ�ȡ���ַ�������
			fw.write(arr);//���ַ������е�����д���ļ���
		}
		
		fr.close();
		fw.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		//�ַ������ܿ������ı����ļ�
		FileReader fr=new FileReader("Tulips.jpg");
		FileWriter fw=new FileWriter("copy.jpg");
		
		int c;
		while((c=fr.read())!=-1){
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr=new FileReader("xxx.txt");
		FileWriter fw=new FileWriter("yyy.txt");
		
		int c;
		while((c=fr.read())!=-1){
			fw.write(c);
		}
		
		fr.close();
		fw.close();  //Write������һ��2K��С��������������������ͻὫ����д��������������ͽ�������������ˢ�µ��ļ��У��ٹ���
	}
}
