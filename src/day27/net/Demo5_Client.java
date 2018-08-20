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
		//����Socket����ָ����������ַ�Ͷ˿ں�
		Socket socket=new Socket("127.0.0.1", 8989);
		//��ȡ������
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//��ȡ�����
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		new Thread(){
			public void run() {
				String str;
				try {
					while((str= br.readLine())!=null){
						System.out.println("Client receive��"+str);
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
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		socket.close();
	}
}
