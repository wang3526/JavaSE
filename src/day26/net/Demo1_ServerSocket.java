package day26.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		//��ͻ��˷�������
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("���������յ������ݣ�"+new String(arr, 0, len));
			if(len<1024){
				fos.write("���������ճɹ�".getBytes());
				fos.flush();
			}
		}
		
		fis.close();
		
		
		
		fos.close();
		
		//socket.close();
	}
}
