package day27.net;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 字节流读取数据
 * */
public class Demo1_Server {
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象，并指定端口号
		ServerSocket server=new ServerSocket(47263);
		//获取Socket对象
		Socket socket=server.accept();
		//获取字符输入流
		InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		//获取字符输出流
		OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream());
		
		//读取客户端的数据
		int len;
		char[] arr=new char[1024];
		while((len=isr.read(arr))!=-1){
			System.out.println("读取的客户端数据："+new String(arr, 0, len));
			if(len<1024){
				osw.write("我是服务端，已接收");
				osw.flush();
			}
		
		}
		
		
	}
}
