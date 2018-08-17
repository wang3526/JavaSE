package day24.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo2_Send {
	/**
	 *  1.����Send
			* ����DatagramSocket, ����˿ں�
			* ����DatagramPacket, ָ������, ����, ��ַ, �˿�
			* ʹ��DatagramSocket����DatagramPacket
			* �ر�DatagramSocket
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);//��������¼�����
		DatagramSocket socket=new DatagramSocket();//����socket���൱����ͷ
		while(true){
			String str=sc.nextLine();//��ȡ����¼����ַ���
			if("quit".equals(str)){
				break;
			}
			//����packet���൱�ڼ�װ��
			DatagramPacket packet=
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);//�����������ݷ���ȥ
		}
		socket.close();
	}
}
