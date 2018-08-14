package day21.io.stream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ������ ���������ⲿ�����ݣ���ȡ���ڴ���
 * */
public class Demo1_FileInputStream {
	public static void main(String[] args) throws IOException {
		//1������һ�������ֽ������󣬹���ָ��Ҫ�������ļ�
		//1.1�������ļ�·��
		String path="aaa.txt";//����Դ
		//1.2����ʼ������������
		FileInputStream fis=new FileInputStream(path);
		//2����ȡ����
		//2.1��������ʣ����ֽ�
		System.out.println(fis.available());
		//2.2����ȡһ���ֽ�
		//System.out.println(fis.read());
		//System.out.println(fis.available());
		
		//����������
		/*byte[] b=new byte[fis.available()];
		int len=fis.read(b); //�����е����ݶ�ȡ��byte�����У����ر��ν��յ��ֽ���
		System.out.println(len);*/
		
		byte[] b=new byte[4];
		int len;
		while((len=fis.read(b))!=-1){
			System.out.print(new String(b,0,len));
		}
		
		
		//3���ر���
		fis.close();
	}
}
