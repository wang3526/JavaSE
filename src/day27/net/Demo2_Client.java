package day27.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �ϴ��ļ�
 * */
public class Demo2_Client {
	public static void main(String[] args) throws IOException {
		//����Socket�׽��֣���ָ��IP��ַ�Ͷ˿ں�
		Socket socket=new Socket("127.0.0.1",54327);
		//�����ļ�����
		File file=new File("Tulips.jpg");
		//��ȡ����������
		FileInputStream fis=new FileInputStream(file);
		//��ȡ���������
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//��Ӳ���ж�ȡ�ļ�
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			//�ϴ��ļ�
			fos.write(arr, 0, len);
			fos.flush();
		}
		
		fis.close();
		fos.close();
		socket.close();
		
	}
}
