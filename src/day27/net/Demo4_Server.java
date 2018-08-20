package day27.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * ���������̣߳�����
 * */
public class Demo4_Server {
	public static void main(String[] args) throws IOException {
		//����ServerSocket���󣬲�ָ���˿ں�
		ServerSocket server=new ServerSocket(35241);
		while(true){
			//��ȡSocket����
			Socket socket= server.accept();
			new Thread(){
				public void run() {
					try {
						//��ȡ�ַ�������
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
						//��ȡ�ַ������
						PrintStream ps=new PrintStream(socket.getOutputStream());
						//��������¼�����
						Scanner sc=new Scanner(System.in);
						System.out.println(br.readLine());
						ps.println(sc.nextLine());
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}.start();
			
		}
		
		
	}
}
