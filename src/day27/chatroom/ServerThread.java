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
	private Socket socket;   //����Socket����

	public ServerThread() {

	}

	public ServerThread(Socket socket) {  //�вι���,��ȡSocket
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//��ȡ������
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//��ȡ�����
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//��ȡSocketMap����
			SocketMap sm=SocketMap.getSocketMap();
			//��socket��ӽ�����
			sm.setHashMap(socket);
			//�����ַ�������
			String line;
			//��ȡ�ͻ������������
			while ((line=br.readLine())!=null) {
				//�ָ��ַ�������ȡ�ַ������飬arr[0]Ϊ�ͻ���ip��ַ��arr[1]Ϊ�ͻ��˷��͵�����
				String[] arr=line.split("&");
				receive(arr[0],arr[1]);//ͨ��ip����ȡSocket����
				//send(socket, arr[1]);   //�������ݵ�ָ���Ŀͻ���
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void receive(String s1,String s2) throws IOException{   //���������յ��ͻ���ip��ַ��ѭ��������ȡ��Ӧ��Socket����
		HashMap<String, Socket> hm=SocketMap.getSocketMap().getHm();
		if("255.255.255.255".equals(s1)){
			for(String key:hm.keySet()){
				send(hm.get(key), s2);
			}
		}
		for (String key : hm.keySet()) {
			if(s1.equals(key)){  //�ж�ip�Ƿ����
				send(socket, s2);
			}
		}
	}
	
	public void send(Socket socket,String s1) throws IOException{  //���������Ϳͻ��˵����ݵ�ָ���ͻ���
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write(socket.getInetAddress().getHostAddress()+"���͵����ݣ�");
		bw.write(s1);
		bw.newLine();
		bw.flush();
		//bw.close();
	}
}
