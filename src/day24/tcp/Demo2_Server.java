package day24.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo2_Server {
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
		//demo1();
		ServerSocket server=new ServerSocket(34265);
		
		while(true){
			final Socket socket=server.accept();//���ܿͻ��˵�����
			new Thread(){
				public void run() {
					try {
						//���ֽ�����װ�����ַ���
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
						//PrintStream����д�����еķ���
						PrintStream ps=new PrintStream(socket.getOutputStream());

						ps.println("��ӭ��ѯ�������Ա");
						System.out.println(br.readLine());
						ps.println("������˼��������");
						System.out.println(br.readLine());

						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				};
			}.start();
			
		}
		
	}

	private static void demo1() throws IOException {
		ServerSocket server=new ServerSocket(34265);
		
		Socket socket=server.accept();//���ܿͻ��˵�����
		//���ֽ�����װ�����ַ���
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//PrintStream����д�����еķ���
		PrintStream ps=new PrintStream(socket.getOutputStream());
		
		ps.println("��ӭ��ѯ�������Ա");
		System.out.println(br.readLine());
		ps.println("������˼��������");
		System.out.println(br.readLine());
		
		socket.close();
		//server.close();
	}
}
