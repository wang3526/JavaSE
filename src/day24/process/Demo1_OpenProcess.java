package day24.process;

import java.io.IOException;

public class Demo1_OpenProcess {
	/**
	 * Java���������̵����ַ�ʽ
	 * 	1��ͨ��Runtime��
	 * 	2��ͨ��ProcessBuilder��
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		/*//ͨ��Runtime
		Runtime time=Runtime.getRuntime();
		//�򿪽���
		time.exec("notepad");*/
		
		//ͨ��������������������
		ProcessBuilder pb=new ProcessBuilder("notepad");
		//��������
		pb.start();
	}
}
