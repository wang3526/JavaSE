package day20.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test7 {
	/**
	 * * ����������һ�����ð����,û�й��������ʱ��,ÿִ��һ�ξͻ��������ǻ��ж��ٴ�
	 * ʹ�û�����ѧ����IO��֪ʶ,ģ�����ð����,����10�λ���,ִ��һ�ξ���ʾһ��������
	 * ���λ���,�������������ʾ�빺������
	 * @throws IOException 
	 * 
	 * ������
	 * 1�������������������������ΪҪʹ��readLine���������Ա�֤���ݵ�ԭ����
	 * 2�����������ַ���ת����int��
	 * 3����int�������жϣ��������0���ͽ���--д��ȥ�����������0������ʾ�빺������
	 * 4����if�ж���Ҫ��--�Ľ����ӡ���������ͨ�������д���ļ���
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		//1�������������������������ΪҪʹ��readLine���������Ա�֤���ݵ�ԭ����
		BufferedReader br=new BufferedReader(new FileReader("config.txt"));
		//2�����������ַ���ת����int��
		String line=br.readLine();
		int times=Integer.parseInt(line);//�������ַ���ת��������
		//3����int�������жϣ��������0���ͽ���--д��ȥ�����������0������ʾ�빺������
		if(times>0){
			//4����if�ж���Ҫ��--�Ľ����ӡ���������ͨ�������д���ļ���
			System.out.println("������"+times--+"�λ���");
			FileWriter fw=new FileWriter("config.txt");
			fw.write(times+"");
			fw.close();
		}else {
			System.out.println("�������ô����Ե��빺������");
		}
		
	}
}
