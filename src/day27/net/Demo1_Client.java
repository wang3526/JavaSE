package day27.net;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �ֽ�����ȡ����
 * */
public class Demo1_Client {
	public static void main(String[] args) throws IOException {
		//����Socket�׽��֣���ָ��IP��ַ�Ͷ˿ں�
		Socket socket=new Socket("127.0.0.1", 47263);
		//��ȡ�ַ������
		OutputStreamWriter osw=new OutputStreamWriter(socket.getOutputStream());
		//��ȡ�ַ�������
		InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		//������д����
		osw.write("���ǿͻ���");
		osw.flush();
		//��ȡ���������
		int len;
		char[] arr=new char[1024];
		while((len=isr.read(arr))!=-1){
			System.out.println("�ͻ��˶�ȡ�����ݣ�"+new String(arr, 0, len));
		}
		
	}
}
