package day27.net;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 登录操作
 * */
public class Demo3_Client {
	public static void main(String[] args) throws IOException{
		//创建Socket套接字，并指定ip地址和端口号
		Socket socket=new Socket("127.0.0.1", 32451);
		//获取字符输入流
		InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		//获取输出流
		PrintStream ps=new PrintStream(socket.getOutputStream());
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入账号：");
		ps.println(sc.nextLine());
		System.out.println("请输入密码：");
		ps.println(sc.nextLine());
		
		//获取服务端返回的数据
		int len;
		char[] arr=new char[1024];
		while((len=isr.read(arr))!=-1){
			System.out.println(new String(arr, 0, len));
		}
		socket.close();
	}
}
