package day27.chatroom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����
 * */
public class Server {
	public static void main(String[] args) throws IOException {
		//����ServerSocket���󣬲�ָ���˿ں�
		ServerSocket server=new ServerSocket(9898);
		//����Socket
		Socket socket;
		//��ȡsocket���ж��Ƿ�Ϊ��
		while((socket=server.accept())!=null){
			//��ȡ�ͻ��˵�ip��ַ
			System.out.println("������������"+socket.getInetAddress().getHostAddress());
			//�����߳�
			new ServerThread(socket).start();
		}
	}
}
