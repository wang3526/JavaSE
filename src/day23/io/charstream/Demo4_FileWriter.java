package day23.io.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo4_FileWriter {
	/**
	 * FileWriter��OutputStreamWriter������
	 * @throws IOException 
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		//1������FileWriter����
		FileWriter fw=new FileWriter("aaa.txt", true);
		//2��д���ַ�
		//2.1��д�뵥���ַ�
		fw.write('��');
		fw.write("С�ǡ����ǡ���褡����");
		//ˢ��
		fw.flush();
		//3���ر���
		fw.close();
		
	}
}
