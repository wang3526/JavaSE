package day26.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1_ServerSocket {
	/**
	 * �����socket
	 * 1���������пͻ��˵�����
	 * 2�����տͻ��˷��͹���������
	 * 3�����͸��ͻ�������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//����ServerSocket���󣬲��󶨱��صĶ˿ں�
		System.out.println("�ȴ��ͻ�������...");
		ServerSocket server=new ServerSocket(8887);
		//2�����������ͻ������ӹ����Ķ���   �ϵ�
		Socket socket=server.accept();
		System.out.println("�ͻ������ӳɹ�");
		//3�����տͻ�������
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��ͻ��˷�������
		PrintStream ps=new PrintStream(socket.getOutputStream());
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println("���������յ������ݣ�"+line);
		}
		ps.println("���������ճɹ�".getBytes());
		br.close();
		
		
		
		ps.close();
		
		//socket.close();
	}
}
