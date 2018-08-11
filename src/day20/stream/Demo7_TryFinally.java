package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_TryFinally {
	public static void main(String[] args) throws IOException {
		//demo1();
		try(
		FileInputStream fis=new FileInputStream("yyy.txt");
		FileOutputStream fos=new FileOutputStream("xxx.txt");
		){
			int b;
			while((b=fis.read())!=-1){
				fos.write(b);
			}
		}

	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream("yyy.txt");
			fos=new FileOutputStream("xxx.txt");
			
			int b;
			while((b=fis.read())!=-1){
				fos.write(b);
			}
		}finally{
			try{
				if(fis!=null)
					fis.close();
			}finally {             //try finally的嵌套目的是能关一个关一个
				if(fos!=null)
					fos.close();
			}
		}
	}
}
