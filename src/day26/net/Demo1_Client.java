package day26.net;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1_Client {
	/**
	 * �ͻ���socket����
	 * 1�����ӵ�������socket����
	 * 2���������ݸ�������
	 * 3�����շ��������ص�����
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * */
	public static void main(String[] args) throws UnknownHostException, IOException{
		//1�������ͻ���socket���Ӷ���ָ���˿ںź�������ַ
		Socket socket=new Socket("127.0.0.1", 8887);
		//����������������
		System.out.println("�ͻ��˿�ʼ��������...");
		PrintStream ps=new PrintStream(socket.getOutputStream());
		//���տͻ�������
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		ps.write("���ǿͻ��ˣ����͵�����".getBytes());
		ps.close();
		System.out.println("�ͻ������ݷ�����ϣ��ȴ��������Ӧ");
		
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		socket.close();
	}
}
