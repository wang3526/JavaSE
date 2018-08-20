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
	 * 客户端socket对象
	 * 1、连接到服务器socket对象
	 * 2、发送数据给服务器
	 * 3、接收服务器发回的数据
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * */
	public static void main(String[] args) throws UnknownHostException, IOException{
		//1、创建客户端socket连接对象，指定端口号和主机地址
		Socket socket=new Socket("127.0.0.1", 8887);
		//往服务器发送数据
		System.out.println("客户端开始发送数据...");
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//接收客户端数据
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		fos.write("我是客户端，发送的数据".getBytes());
		fos.flush();
		System.out.println("客户端数据发送完毕，等待服务端响应");
		
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("我是客户端"+new String(arr,0,len));
		}
		fos.close();
		fis.close();
		socket.close();
	}
}
