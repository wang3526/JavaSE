package day23.io.charstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo2_OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		//�����ַ�������������ֽ���
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("aaa.txt",true));
		//д������
		//�����ַ�
		osw.write('a');
		//�ַ�����
		char[] arr={'b','c','d','2','3','4'};
		osw.write(arr);
		//д���ַ����飬���������ĸ�λ�ÿ�ʼ��ˢ����ٸ��ַ�
		osw.write(arr, 2, 1);
		//д���ַ���
		String line="С�ǡ�����";
		osw.write(line);
		
		//ˢ��
		osw.flush();
		//�ر���
		osw.close();
	}
}
