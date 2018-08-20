package day27.chatroom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

public class ServerThread extends Thread{
	private Socket socket;   //声明Socket变量

	public ServerThread() {

	}

	public ServerThread(Socket socket) {  //有参构造,获取Socket
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//获取输入流
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//获取输出流
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//获取SocketMap对象
			SocketMap sm=SocketMap.getSocketMap();
			//将socket添加进集合
			sm.setHashMap(socket);
			//声明字符串变量
			String line;
			//读取客户端输入的数据
			while ((line=br.readLine())!=null) {
				//分割字符串，获取字符串数组，arr[0]为客户端ip地址，arr[1]为客户端发送的数据
				String[] arr=line.split("&");
				receive(arr[0],arr[1]);//通过ip，获取Socket对象
				//send(socket, arr[1]);   //发送数据到指定的客户端
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void receive(String s1,String s2) throws IOException{   //服务器接收到客户端ip地址，循环遍历获取对应的Socket对象
		HashMap<String, Socket> hm=SocketMap.getSocketMap().getHm();
		if("255.255.255.255".equals(s1)){
			for(String key:hm.keySet()){
				send(hm.get(key), s2);
			}
		}
		for (String key : hm.keySet()) {
			if(s1.equals(key)){  //判断ip是否相等
				send(socket, s2);
			}
		}
	}
	
	public void send(Socket socket,String s1) throws IOException{  //服务器发送客户端的数据到指定客户端
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write(socket.getInetAddress().getHostAddress()+"发送的数据：");
		bw.write(s1);
		bw.newLine();
		bw.flush();
		//bw.close();
	}
}
