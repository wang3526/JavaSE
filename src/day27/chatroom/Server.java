package day27.chatroom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * */
public class Server {
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象，并指定端口号
		ServerSocket server=new ServerSocket(9898);
		//声明Socket
		Socket socket;
		//获取socket，判断是否为空
		while((socket=server.accept())!=null){
			//获取客户端的ip地址
			System.out.println("服务器连接了"+socket.getInetAddress().getHostAddress());
			//开启线程
			new ServerThread(socket).start();
		}
	}
}
