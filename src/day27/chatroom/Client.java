package day27.chatroom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//发送格式192.168.1.1&sdecsd
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建Socket对象，指定服务器地址和端口号
		Socket socket=new Socket("192.168.4.243",9898);
		//获取输入流
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//获取输出流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//开启接收数据的线程
		new Thread(){
			public void run() {
				String line;
				try {
					//客户端读取服务器发送的数据
					while((line=br.readLine())!=null){
						System.out.println(line);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}.start();
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		String line;
		while((line=sc.nextLine())!=null){
			bw.write(line);//客户端发送数据到服务器
			bw.newLine();
			bw.flush();
		}
		socket.close();
		
	}
}
