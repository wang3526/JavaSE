package day23.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo3_FileReader {
	/**
	 * FileReader��InputStreamReader������
	 * ֻ��ʹ��ƽ̨Ĭ�ϵ��ַ������ʽ
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//1������һ��FileReader����
		FileReader fr=new FileReader("aaa.txt");
		//2����ȡ�ַ�
			//2.1������һ���ַ�������
		char[] arr=new char[10];
			//2.2���������ճ��ȵı���
		int len;
		//2.3��ѭ����ȡ�ַ�
		while((len=fr.read(arr))!=-1){
			System.out.print(new String(arr,0,len));
		}
		//3���ر���
		fr.close();
		
	}
}
