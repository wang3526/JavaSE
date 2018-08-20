package day27.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo5_Server {
	public static void main(String[] args) throws IOException {
		//创建SocketServer对象，指定端口号
		ServerSocket server=new ServerSocket(8989);
		//获取Socket对象
		Socket socket=server.accept();
		//获取输入流
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//获取输出流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//从客户端读取数据
		String line;
		//向客户端输入数据
		while((line=br.readLine())!=null){
			System.out.println("server receive："+line);
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		socket.close();
	}
}
