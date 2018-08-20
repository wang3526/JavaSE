package day26.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����
 * */
public class Demo2_ServerSocket {
	public static void main(String[] args) throws IOException {
		//����SocketServer���󣬲�ָ���˿ں�
		ServerSocket server=new ServerSocket(46352);
		//��ȡsocket�׽���
		Socket socket=server.accept();
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		//��ȡ������
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		//��ȡ�����
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//��ȡ�ͻ�������
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("����˽��յ����ݣ�"+new String(arr, 0, len));
			if(len<1024){
				System.out.println("����������룺");
				String line=sc.nextLine();
				fos.write(line.getBytes());
				fos.flush();
			}
		}
		
	}

}
