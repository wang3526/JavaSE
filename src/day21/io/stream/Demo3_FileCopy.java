package day21.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_FileCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("aaa.txt");
		FileOutputStream fos=new FileOutputStream("bbb.txt");
		
		//����ֽڶ�д
		/*int b;
		while((b=fis.read())!=-1){
			fos.write(b);
		}*/
		
		//һ�ζ�д����ֽ�
		int len;
		byte[] b=new byte[8];
		while((len=fis.read(b))!=-1){
			fos.write(b, 0, len);
		}
		
		fis.close();
		fos.close();
	}
}
