package day27.chatroom;

import java.net.Socket;
import java.util.HashMap;

public class SocketMap {
	//����SocketMap����
	private static SocketMap socketMap=null;
	//����HashMap���ϱ���
	HashMap<String, Socket> hm;
	private SocketMap() {
		
	}

	public static SocketMap getSocketMap(){  //��������
		if(socketMap==null){
			socketMap=new SocketMap();
		}
		return socketMap;
	} 
	
	public HashMap<String, Socket> getHm() {  //��ȡHashMap����
		return hm;
	}

	public void setHashMap(Socket socket){ //��Socket��ӵ�������
		hm=new HashMap<String, Socket>();
		hm.put(socket.getInetAddress().getHostAddress().toString(),socket);
	}

	
	
}
