package day27.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo3_Server {
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象，并指定端口号
		ServerSocket server=new ServerSocket(32451);
		//获取socket套接字
		Socket socket=server.accept();
		//获取字符输入流
		BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//获取字符输出流
		PrintStream ps=new PrintStream(socket.getOutputStream());
		
		String userName=br.readLine();
		String psw=br.readLine();
		if("admin".equals(userName)&&"123456".equals(psw)){
			ps.println("登录成功");
		}else {
			ps.println("登录失败");
		}
		socket.close();
	}
}
