package day21.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_PictureCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Tulips.jpg");
		FileOutputStream fos=new FileOutputStream("copy.jpg");
		
		int len;
		byte[] b=new byte[1024];
		while((len=fis.read(b))!=-1){
			fos.write(b,0,len);
		}
		
		fis.close();
		fos.close();
	}
}
