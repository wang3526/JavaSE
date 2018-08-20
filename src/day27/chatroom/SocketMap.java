package day27.chatroom;

import java.net.Socket;
import java.util.HashMap;

public class SocketMap {
	//声明SocketMap变量
	private static SocketMap socketMap=null;
	//声明HashMap集合变量
	HashMap<String, Socket> hm;
	private SocketMap() {
		
	}

	public static SocketMap getSocketMap(){  //创建对象
		if(socketMap==null){
			socketMap=new SocketMap();
		}
		return socketMap;
	} 
	
	public HashMap<String, Socket> getHm() {  //获取HashMap集合
		return hm;
	}

	public void setHashMap(Socket socket){ //将Socket添加到集合中
		hm=new HashMap<String, Socket>();
		hm.put(socket.getInetAddress().getHostAddress().toString(),socket);
	}

	
	
}
