package day20.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test5 {
	/**
	 * * ��һ���ı��ĵ��ϵ��ı���ת,��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
	 * 
	 * ������
	 * 1�������������������
	 * 2���������϶���
	 * 3�������������ݴ洢�ڼ�����
	 * 4�����ű������Ͻ�����д���ļ���
	 * 5������
	 * @throws IOException 
	 * 
	 * ע�����
	 * �������������
	 * */
	public static void main(String[] args) throws IOException {
		//��д�󣬾��������
		// 1�������������������
		BufferedReader br=new BufferedReader(new FileReader("xxx.txt"));
		
		//2���������϶���
		ArrayList<String> list=new ArrayList<String>();
		// 3�������������ݴ洢�ڼ�����
		String line;
		while((line=br.readLine())!=null){
			list.add(line);
		}
		br.close();
		
		//4�����ű������Ͻ�����д���ļ���
		BufferedWriter bw=new BufferedWriter(new FileWriter("revxxx.txt"));
		for (int i = list.size()-1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		//5������
		bw.close();
		
		
	}
}
