package day23.io.charstream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo6_BufferedWriter {
	/**
	 * BufferedWriter��Writer������
	 * 1������д��һ�����ݣ����Ի���
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//1������BufferedWriter����
		//1.1��ָ�������ʽ
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("aaa.txt"),"GBK"));
		//1.2��ʹ��ƽ̨Ĭ�ϱ����ʽ
		BufferedWriter bw=new BufferedWriter(new FileWriter("aaa.txt",true));
		
		//2��д������
		bw.write("������");
		//����
		bw.newLine();
		//bw.write("С�ǡ�����");
		//ˢ��
		bw.flush();
		//3���ر���
		bw.close();
	}
}
