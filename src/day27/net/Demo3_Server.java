package day27.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo3_Server {
	public static void main(String[] args) throws IOException {
		//����ServerSocket���󣬲�ָ���˿ں�
		ServerSocket server=new ServerSocket(32451);
		//��ȡsocket�׽���
		Socket socket=server.accept();
		//��ȡ�ַ�������
		BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��ȡ�ַ������
		PrintStream ps=new PrintStream(socket.getOutputStream());
		
		String userName=br.readLine();
		String psw=br.readLine();
		if("admin".equals(userName)&&"123456".equals(psw)){
			ps.println("��¼�ɹ�");
		}else {
			ps.println("��¼ʧ��");
		}
		socket.close();
	}
}
