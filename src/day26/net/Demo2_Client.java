package day26.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 客户端
 * */
public class Demo2_Client {
	public static void main(String[] args) throws IOException {
		//创建Socket套接字
		Socket socket=new Socket("127.0.0.1", 46352);
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		//获取输出流
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//获取输入流
		FileInputStream fis=(FileInputStream)socket.getInputStream();
		System.out.println("客户端请输入：");
		String line=sc.nextLine();
		fos.write(line.getBytes());
		
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			System.out.println("服务端发送的数据："+new String(arr, 0, len));
		}
	}
}
