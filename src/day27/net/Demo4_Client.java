package day27.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo4_Client {
	public static void main(String[] args) throws IOException{
		while(true){
			//����Socket�׽��֣���ָ��ip��ַ�Ͷ˿ں�
			Socket socket=new Socket("127.0.0.1", 35241);
			//��ȡ�ַ�������
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//��ȡ�ַ������
			PrintStream ps=new PrintStream(socket.getOutputStream());
			//��������¼�����
			Scanner sc=new Scanner(System.in);
			//���������������
			ps.println(sc.nextLine());
			//���շ���������
			System.out.println(br.readLine());
			socket.close();
		}
	}
}
