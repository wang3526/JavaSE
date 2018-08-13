package day20.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test6 {
	/**
	 * * ��ȡһ���ı���ÿ���ַ����ֵĴ���,�����д��times.txt��
	 * 
	 * ������
	 * 1�����������������������
	 * 2������˫�м��϶���TreeMap
	 * 3�����������ַ��洢�����ϣ��洢��ʱ��Ҫ�жϣ������������������ͽ�����1�洢��
	 * ���������������ͽ��ü���ֵ��1�洢
	 * 4���ر�������
	 * 5���������������
	 * 6���������Ͻ������е�����д��times.txt��
	 * 7���ر������
	 * */
	public static void main(String[] args) throws IOException{
		//1�����������������������
		BufferedReader br=new BufferedReader(new FileReader("xxx.txt"));
		// 2������˫�м��϶���TreeSet
		TreeMap<Character, Integer> tm=new TreeMap<Character, Integer>();
		//3�����������ַ��洢�����ϣ��洢��ʱ��Ҫ�жϣ������������������ͽ�����1�洢��
		 // ���������������ͽ��ü���ֵ��1�洢
		int ch;
		while((ch=br.read())!=-1){
			char c=(char)ch;//ǿ������ת��
			/*if(!tm.containsKey(c)){
				tm.put(c, 1);
			}else{
				tm.put(c,tm.get(c)+1);
			}*/
			tm.put(c, !tm.containsKey(c) ? 1 : tm.get(c)+1);
		}
		//4���ر�������
		br.close();
		//5���������������
		BufferedWriter bw=new BufferedWriter(new FileWriter("times.txt"));
		//6���������Ͻ������е�����д��times.txt��
		for(Character key:tm.keySet()){
			switch (key) {
			case '\t':
				bw.write("\\t"+"="+tm.get(key));//д������ֵ
				break;
			case '\n':
				bw.write("\\n"+"="+tm.get(key));//д������ֵ
				break;
			case '\r':
				bw.write("\\r"+"="+tm.get(key));//д������ֵ
				break;
			default:
				bw.write(key+"="+tm.get(key));//д������ֵ
				break;
			}
			bw.newLine();
		}
		//7���ر������
		bw.close();
		
	}
}