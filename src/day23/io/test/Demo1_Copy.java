package day23.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo1_Copy {
	public static void main(String[] args) throws IOException {
		//����InputStreamReader���󣬹����ֽ�������
		InputStreamReader isr=new InputStreamReader(new FileInputStream("xxx.txt"));
		//����OutputStreamReader���󣬹����ֽ�������
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("copy1.txt"));
		
		//�������ȱ���
		int len;
		//�����ַ�����
		char[] arr=new char[100];
		//��ȡ�ַ����ַ�������
		while((len=isr.read(arr))!=-1){
			//д���ַ������е�����
			osw.write(arr, 0, len);
		}
		
		//�ر���
		isr.close();
		osw.close();
	}
}
