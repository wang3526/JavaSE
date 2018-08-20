package day26.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务端
 * */
public class Demo2_ServerSocket {
	public static void main(String[] args) throws IOException {
		//创建SocketServer对象，并指定端口号
		ServerSocket server=new ServerSocket(46352);
		//获取socket套接字
		Socket socket=server.accept();
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		//获取输入流
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		//获取输出流
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//读取客户端数据
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("服务端接收的内容："+new String(arr, 0, len));
			if(len<1024){
				System.out.println("服务端请输入：");
				String line=sc.nextLine();
				fos.write(line.getBytes());
				fos.flush();
			}
		}
		
	}

}
