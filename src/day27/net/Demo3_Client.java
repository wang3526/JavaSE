package day27.net;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * ��¼����
 * */
public class Demo3_Client {
	public static void main(String[] args) throws IOException{
		//����Socket�׽��֣���ָ��ip��ַ�Ͷ˿ں�
		Socket socket=new Socket("127.0.0.1", 32451);
		//��ȡ�ַ�������
		InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		//��ȡ�����
		PrintStream ps=new PrintStream(socket.getOutputStream());
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		System.out.println("�������˺ţ�");
		ps.println(sc.nextLine());
		System.out.println("���������룺");
		ps.println(sc.nextLine());
		
		//��ȡ����˷��ص�����
		int len;
		char[] arr=new char[1024];
		while((len=isr.read(arr))!=-1){
			System.out.println(new String(arr, 0, len));
		}
		socket.close();
	}
}
