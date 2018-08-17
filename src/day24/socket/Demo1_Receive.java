package day24.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo1_Receive {
	/**
	 * 2.����Receive
			* ����DatagramSocket, ָ���˿ں�
			* ����DatagramPacket, ָ������, ����
			* ʹ��DatagramSocket����DatagramPacket
			* �ر�DatagramSocket
			* ��DatagramPacket�л�ȡ����
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket(6666);//����socket���൱�ڴ�����ͷ
		//����packet���൱�ڴ�����װ��
		DatagramPacket packet=new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);//��������
		
		byte[] arr=packet.getData();//��ȡ����
		int len=packet.getLength(); //��ȡ��Ч���ֽڸ���
		System.out.println(new String(arr, 0, len));
		socket.close();//�ص�
		
		
	}
}
