package day23.io.charstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1_InputStreamReader {
	public static void main(String[] args) throws IOException {
		//�����ַ�����������
		InputStreamReader isr=new InputStreamReader(new FileInputStream("aaa.txt"));
		
		//��ȡ�����ַ�
		System.out.print((char)isr.read());
		
		//��ȡ�ַ����ַ�������
		int b;
		char[] chuf=new char[5];
		while((b=isr.read(chuf))!=-1){
			//������յ����ݣ����ַ�����ת����string����
			System.out.print(new String(chuf, 0, b));
		}
		
		isr.close();
	}
}
