package day27.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �ϴ��ļ�
 * */
public class Demo2_Server {
	public static void main(String[] args) throws IOException {
		//����ServerSocket����
		ServerSocket server=new ServerSocket(54327);
		//��ȡsocket�׽���
		Socket socket=server.accept();
		//��ȡ�ļ�������
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		//��ȡ�ļ������
		FileOutputStream fos=new FileOutputStream("copy.jpg");
		//��ȡ�ļ�
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			fos.write(arr, 0, len);
			fos.flush();
		}
		
		fis.close();
		fos.close();
		socket.close();
	}
}
