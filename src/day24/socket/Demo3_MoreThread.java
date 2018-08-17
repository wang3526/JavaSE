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
			DatagramSocket socket=new DatagramSocket(6666);//创建socket，相当于创建码头
			//创建packet，相当于创建集装箱
			DatagramPacket packet=new DatagramPacket(new byte[1024], 1024);
		
			while(true){
				socket.receive(packet);//接收数据
				byte[] arr=packet.getData();//获取数据
				int len=packet.getLength(); //获取有效的字节个数
				String ip=packet.getAddress().getHostAddress();//获取IP地址
				int port=packet.getPort();  //获取端口号
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


