package day23.io.charstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo5_BufferedReader {
	/**
	 * BufferedReader��Reader������
	 * ����ص㣺ÿ�ο��Զ�ȡһ�У�һ�еĶ�����Ƕ�ȡ�����з���һ�н���
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//1������BufferedReader����
		//ʹ���ֶ����ñ����ʽ
		/*BufferedReader br=
				new BufferedReader(new InputStreamReader(new FileInputStream("aaa.txt")));*/
		//ʹ��ƽ̨Ĭ�ϱ����ʽ
		BufferedReader br=new BufferedReader(new FileReader("aaa.txt"));//��Ҫһ��Reader����
		//2����ȡ����
		/*//��ȡ�����ַ�
		System.out.println((char)br.read());
		//��ȡ����ַ�
		char[] arr=new char[3];
		br.read(arr);
		System.out.println(new String(arr));
		//��ȡһ���ַ������������з�����
		System.out.println(br.readLine());*/
		String str=null;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		
		
		//3���ر���
		br.close();
	}
}
