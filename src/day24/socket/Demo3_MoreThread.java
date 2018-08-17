package day24.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo3_MoreThread {
	public static void main(String[] args) {
		new Recive().start();
		new Send().start();
	}
}

class Recive extends Thread{
	public void run() {
		try {
			DatagramSocket socket=new DatagramSocket(6666);//����socket���൱�ڴ�����ͷ
			//����packet���൱�ڴ�����װ��
			DatagramPacket packet=new DatagramPacket(new byte[1024], 1024);
		
			while(true){
				socket.receive(packet);//��������
				byte[] arr=packet.getData();//��ȡ����
				int len=packet.getLength(); //��ȡ��Ч���ֽڸ���
				String ip=packet.getAddress().getHostAddress();//��ȡIP��ַ
				int port=packet.getPort();  //��ȡ�˿ں�
				System.out.println(ip+":"+port+":"+new String(arr, 0, len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}

class Send extends Thread{
	public void run() {
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


