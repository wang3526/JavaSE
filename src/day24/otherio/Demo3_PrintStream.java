package day24.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo3_PrintStream {
	/**
	 * PrintStream
	 * ��ӡ���������������ֽ���������ͬ������������ݣ��Դ����з�
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//����PrintStream����
		PrintStream ps=new PrintStream(new FileOutputStream("xxx.txt"));
		//д������
		ps.print(true);
		ps.print(123);
		ps.print(12.3f);
		ps.print("hello");
		//�ر���
		ps.close();
	}
}
