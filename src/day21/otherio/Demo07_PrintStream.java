package day21.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import day16.arraylist.Person;

public class Demo07_PrintStream {
	/**
	 * PrintStream��PrintWrite�ֱ��ӡ�����ֽ������ַ���
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		PrintWriter pw=new PrintWriter(new FileOutputStream("bbb.txt"),true);
		//pw.println(97);//�Զ�ˢ������ֻ��Ե���println����
		//pw.write(97);
		pw.print(97);
		pw.println(97);
		pw.close();
		
		
	}

	private static void demo1() {
		System.out.println("aaa");
		PrintStream ps=System.out;//��ȡ��׼�����
		ps.println(97);//�ײ�ͨ��Integer.toString()��97ת�����ַ�������ӡ
		ps.write(97); //��������ҵ���Ӧ��a����ӡ
		
		Person p1=new Person("����",23);
		ps.println(p1);//Ĭ�ϵ���p1��toString����
		
		Person p2=null;
		ps.println(p2);//��ӡ�����������ͣ������null���ʹ�ӡnull���������null���ʹ�ӡ�����toString����
		ps.close();
	}
}
