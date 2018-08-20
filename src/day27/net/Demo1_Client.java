package day27.net;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 字节流读取数据
 * */
public class Demo1_Client {
	public static void main(String[] args) throws IOException {
		//创建Socket套接字，并指定IP地址和端口号
		Socket socket=new Socket("127.0.0.1", 47263);
		//获取字符输出流
		OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream());
		//获取字符输入流
		InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		//向服务端写数据
		osw.write("我是客户端");
		osw.flush();
		//读取服务端数据
		int len;
		char[] arr=new char[1024];
		while((len=isr.read(arr))!=-1){
			System.out.println("客户端读取的数据："+new String(arr, 0, len));
		}
		
	}
}
