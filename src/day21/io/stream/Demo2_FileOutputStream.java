package day21.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������������ڴ��е����ݣ�д�뵽һ��ָ�����ļ��л��͵�����
 * */
public class Demo2_FileOutputStream {
	public static void main(String[] args) throws IOException {
		//1������һ����������󣬶����������ļ���ͬʱ�Զ�����
		//1.1������һ���ļ�
		String name="aaa.txt";
		//1.2����������,�ڶ������������Ƿ�׷��
		FileOutputStream fos=new FileOutputStream(name,true);//ÿ�����ݸ���
		
		//2�����ڴ��е�����д�뵽����
		//1��������д�뵽����
		String str="hello world!";
		//2����String����ת����byte����
		byte[] b=str.getBytes();
		fos.write(b);
		fos.write(b, 0, b.length);//��b�����д�0��ʼ��λ�õ����鳤�ȵ��ֽ�д�뵽ָ���ļ�
		fos.write(97);//д�뵥���ַ�
		//3��ǿ��ˢ�����е����ݣ����ļ���
		fos.flush();
		
		//4���ر���
		fos.close();
	}
}
