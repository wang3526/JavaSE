package day27.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 上传文件
 * */
public class Demo2_Server {
	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象
		ServerSocket server=new ServerSocket(54327);
		//获取socket套接字
		Socket socket=server.accept();
		//获取文件输入流
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		//获取文件输出流
		FileOutputStream fos=new FileOutputStream("copy.jpg");
		//读取文件
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			fos.write(arr, 0, len);
			fos.flush();
		}
		
		fis.close();
		fos.close();
		socket.close();
	}
}
