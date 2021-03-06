package day26.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1_ServerSocket {
	/**
	 * 服务端socket
	 * 1、监听所有客户端的连接
	 * 2、接收客户端发送过来的数据
	 * 3、发送给客户端数据
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象，并绑定本地的端口号
		System.out.println("等待客户端连接...");
		ServerSocket server=new ServerSocket(8887);
		//2、阻塞监听客户端连接过来的对象   断点
		Socket socket=server.accept();
		System.out.println("客户端连接成功");
		//3、接收客户端数据
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		//向客户端发送数据
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("服务器接收到的数据："+new String(arr, 0, len));
			if(len<1024){
				fos.write("服务器接收成功".getBytes());
				fos.flush();
			}
		}
		
		fis.close();
		
		
		
		fos.close();
		
		//socket.close();
	}
}
