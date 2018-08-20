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
 * 上传文件
 * */
public class Demo2_Client {
	public static void main(String[] args) throws IOException {
		//创建Socket套接字，并指定IP地址和端口号
		Socket socket=new Socket("127.0.0.1",54327);
		//创建文件对象
		File file=new File("Tulips.jpg");
		//获取输入流对象
		FileInputStream fis=new FileInputStream(file);
		//获取输出流对象
		FileOutputStream fos=(FileOutputStream)socket.getOutputStream();
		//从硬盘中读取文件
		int len;
		byte[] arr=new byte[1024];
		while((len=fis.read(arr))!=-1){
			//上传文件
			fos.write(arr, 0, len);
			fos.flush();
		}
		
		fis.close();
		fos.close();
		socket.close();
		
	}
}
