package day24.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo1_Receive {
	/**
	 * 2.接收Receive
			* 创建DatagramSocket, 指定端口号
			* 创建DatagramPacket, 指定数组, 长度
			* 使用DatagramSocket接收DatagramPacket
			* 关闭DatagramSocket
			* 从DatagramPacket中获取数据
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket(6666);//创建socket，相当于创建码头
		//创建packet，相当于创建集装箱
		DatagramPacket packet=new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);//接收数据
		
		byte[] arr=packet.getData();//获取数据
		int len=packet.getLength(); //获取有效的字节个数
		System.out.println(new String(arr, 0, len));
		socket.close();//关掉
		
		
	}
}
