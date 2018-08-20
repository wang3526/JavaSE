package day26.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * �ͻ���
 * */
public class Demo2_Client {
	public static void main(String[] args) throws IOException {
		//����Socket�׽���
		Socket socket=new Socket("127.0.0.1", 46352);
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		//��ȡ�����
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//��ȡ������
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		System.out.println("�ͻ��������룺");
		String line=sc.nextLine();
		fos.write(line.getBytes());
		
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("����˷��͵����ݣ�"+new String(arr, 0, len));
		}
	}
}
