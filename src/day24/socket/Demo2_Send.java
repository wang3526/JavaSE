package day24.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo2_Send {
	/**
	 *  1.发送Send
			* 创建DatagramSocket, 随机端口号
			* 创建DatagramPacket, 指定数据, 长度, 地址, 端口
			* 使用DatagramSocket发送DatagramPacket
			* 关闭DatagramSocket
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);//创建键盘录入对象
		DatagramSocket socket=new DatagramSocket();//创建socket，相当于码头
		while(true){
			String str=sc.nextLine();//获取键盘录入的字符串
			if("quit".equals(str)){
				break;
			}
			//创建packet，相当于集装箱
			DatagramPacket packet=
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);//发货，将数据发出去
		}
		socket.close();
	}
}
