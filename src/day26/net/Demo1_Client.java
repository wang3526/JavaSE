package day26.net;

import java.io.BufferedReader;
import java.io.FileInputStream;
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
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//���տͻ�������
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		fos.write("���ǿͻ��ˣ����͵�����".getBytes());
		fos.flush();
		System.out.println("�ͻ������ݷ�����ϣ��ȴ��������Ӧ");
		
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("���ǿͻ���"+new String(arr,0,len));
		}
		fos.close();
		fis.close();
		socket.close();
	}
}
