package day24.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo4_PrintWriter {
	public static void main(String[] args) throws IOException {
		//����PrintWriter����
		PrintWriter pw=new PrintWriter("xxx.txt");
		//д������
		pw.write(97);
		pw.write("hello world");
		pw.write("��ã��Һã���Һ�", 3, 2);
		
		//�ر���
		pw.close();
	}
}
