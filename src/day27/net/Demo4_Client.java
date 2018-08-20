package day27.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo4_Client {
	public static void main(String[] args) throws IOException{
		while(true){
			//创建Socket套接字，并指定ip地址和端口号
			Socket socket=new Socket("127.0.0.1", 35241);
			//获取字符输入流
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//获取字符输出流
			PrintStream ps=new PrintStream(socket.getOutputStream());
			//创建键盘录入对象
			Scanner sc=new Scanner(System.in);
			//向服务器发送数据
			ps.println(sc.nextLine());
			//接收服务器数据
			System.out.println(br.readLine());
			socket.close();
		}
	}
}
