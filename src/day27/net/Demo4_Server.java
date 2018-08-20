package day27.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务器多线程，聊天
 * */
public class Demo4_Server {
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象，并指定端口号
		ServerSocket server=new ServerSocket(35241);
		while(true){
			//获取Socket对象
			Socket socket= server.accept();
			new Thread(){
				public void run() {
					try {
						//获取字符输入流
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
						//获取字符输出流
						PrintStream ps=new PrintStream(socket.getOutputStream());
						//创建键盘录入对象
						Scanner sc=new Scanner(System.in);
						System.out.println(br.readLine());
						ps.println(sc.nextLine());
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}.start();
			
		}
		
		
	}
}
