package day24.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(54321);
		System.out.println("服务器启动，绑定54321端口");
		
		while(true){
			final Socket socket=server.accept();//接受客户端的请求
			
			new Thread(){        //开启一条线程
				public void run() {
					try {
						//获取输入流
						BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps=new PrintStream(socket.getOutputStream());//获取输出流
					
						String line=br.readLine(); //将客户端写过来的数据读取出来
						line=new StringBuilder(line).reverse().toString();//链式编程
						ps.println(line);//反转后写回去
						
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				};
			}.start();
		}
	}
}
