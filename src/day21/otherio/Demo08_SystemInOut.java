package day21.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Demo08_SystemInOut {
	public static void main(String[] args) throws IOException {
		//demo1();
		System.setIn(new FileInputStream("aaa.txt"));//�ı��׼������
		System.setOut(new PrintStream("bbb.txt"));//�ı��׼�����
		
		InputStream is=System.in;//��ȡ��׼�ļ�����������Ĭ��ָ����̣��ı��ָ���ļ�
		PrintStream ps=System.out;//��ȡ��׼�������Ĭ��ָ�����̨���ı��ָ���ļ�
		
		int b;
		while((b=is.read())!=-1){
			ps.write(b);
		}
		
		//System.out.println();  //Ҳ��һ����׼����������ùأ�û����Ӳ�̹���
		is.close();
		ps.close();
		
	}

	private static void demo1() throws IOException {
		InputStream is=System.in;
		int x=is.read();
		System.out.println(x);
		
		is.close();
		
		InputStream is2=System.in;
		int y=is2.read();
		System.out.println(y);
	}
}
