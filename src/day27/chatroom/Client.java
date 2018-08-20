package day27.chatroom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//���͸�ʽ192.168.1.1&sdecsd
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//����Socket����ָ����������ַ�Ͷ˿ں�
		Socket socket=new Socket("192.168.4.243",9898);
		//��ȡ������
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��ȡ�����
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//�����������ݵ��߳�
		new Thread(){
			public void run() {
				String line;
				try {
					//�ͻ��˶�ȡ���������͵�����
					while((line=br.readLine())!=null){
						System.out.println(line);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}.start();
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		String line;
		while((line=sc.nextLine())!=null){
			bw.write(line);//�ͻ��˷������ݵ�������
			bw.newLine();
			bw.flush();
		}
		socket.close();
		
	}
}
