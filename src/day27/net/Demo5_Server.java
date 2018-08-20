package day27.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo5_Server {
	public static void main(String[] args) throws IOException {
		//����SocketServer����ָ���˿ں�
		ServerSocket server=new ServerSocket(8989);
		//��ȡSocket����
		Socket socket=server.accept();
		//��ȡ������
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��ȡ�����
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//�ӿͻ��˶�ȡ����
		String line;
		//��ͻ�����������
		while((line=br.readLine())!=null){
			System.out.println("server receive��"+line);
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		socket.close();
	}
}
