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
		PrintStream ps=new PrintStream(socket.getOutputStream());
		//接收客户端数据
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		ps.write("我是客户端，发送的数据".getBytes());
		ps.close();
		System.out.println("客户端数据发送完毕，等待服务端响应");
		
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		socket.close();
	}
}
