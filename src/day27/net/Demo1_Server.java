package day27.net;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �ֽ�����ȡ����
 * */
public class Demo1_Server {
	public static void main(String[] args) throws IOException {
		//����ServerSocket���󣬲�ָ���˿ں�
		ServerSocket server=new ServerSocket(47263);
		//��ȡSocket����
		Socket socket=server.accept();
		//��ȡ�ַ�������
		InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		//��ȡ�ַ������
		OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream());
		
		//��ȡ�ͻ��˵�����
		int len;
		char[] arr=new char[1024];
		while((len=isr.read(arr))!=-1){
			System.out.println("��ȡ�Ŀͻ������ݣ�"+new String(arr, 0, len));
			if(len<1024){
				osw.write("���Ƿ���ˣ��ѽ���");
				osw.flush();
			}
		
		}
		
		
	}
}
