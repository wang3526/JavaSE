package day20.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		
		//第二种拷贝--不推荐使用，因为有可能会导致内存溢出
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Music/李袁杰 - 迷梦.mp3");//创建输入流对象，关联T李袁杰 - 迷梦.mp3
		FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Music/copy1.mp3");
		//int len=fis.available();
		//System.out.println(len);
		
		byte[] arr=new byte[fis.available()];//创建与文件一样大小的字节数组
		fis.read(arr);//将文件上的字节读取到内存中
		fos.write(arr);//将字节数组中的字节数据写到文件上
		
		fis.close();
		fos.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		//第一种拷贝方式
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Music/李袁杰 - 迷梦.mp3");//创建输入流对象，关联T李袁杰 - 迷梦.mp3
		FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Music/copy.mp3");
		
		int b;
		while((b=fis.read())!=-1){     //不断的读取每一个字节
			fos.write(b);        //将每一个字节取出写出
		}
		
		fis.close();       //关流释放资源
		fos.close();
	}
	
	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("Tulips.jpg");//创建输入流对象，关联Tulips.jpg
		FileOutputStream fos=new FileOutputStream("copy.jpg");//创建输出流对象，关联copy.jpg
		
		int b;
		while((b=fis.read())!=-1){     //不断的读取每一个字节
			fos.write(b);        //将每一个字节取出写出
		}
		
		fis.close();       //关流释放资源
		fos.close();
	}
}
