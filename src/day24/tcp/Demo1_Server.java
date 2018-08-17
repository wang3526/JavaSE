package day24.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1_Server {
	/**
	 * * 2.�����
		* ����ServerSocket(��Ҫָ���˿ں�)
		* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
		* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
		* ���������Զ�ȡ�ͻ��������д��������
		* ���������д�����ݵ��ͻ��˵�������
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(34265);
		
		Socket socket=server.accept();//���ܿͻ��˵�����
		InputStream is=socket.getInputStream();//��ȡ�����������
		OutputStream os=socket.getOutputStream();//��ȡ����������
		
		os.write("�ٶ�һ�����֪��".getBytes()); //�������ͻ���д������
		
		byte[] arr=new byte[1024];
		int len=is.read(arr); //��ȡ�ͻ��˷�����������
		System.out.println(new String(arr, 0, len));//������ת�����ַ�����ӡ
		
		socket.close();
		//server.close();
	}
}
