package day27.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo5_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建Socket对象，指定服务器地址和端口号
		Socket socket=new Socket("127.0.0.1", 8989);
		//获取输入流
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//获取输出流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		new Thread(){
			public void run() {
				String str;
				try {
					while((str= br.readLine())!=null){
						System.out.println("Client receive："+str);
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
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		socket.close();
	}
}
