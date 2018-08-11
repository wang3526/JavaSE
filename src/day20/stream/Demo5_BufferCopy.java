package day20.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {
	/**
	 * close方法
	 * 具有刷新的功能，在关闭流之前，就会先刷新一次缓冲区，将缓冲区的字节全部刷新到文件上，
	 * 在关闭，close方法在刷完之后就不能写了
	 * flush方法
	 * 具备刷新的功能，刷完之后还可以继续写
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		/**flush和close方法的区别**/
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("李袁杰 - 迷梦.mp3"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy2.mp3"));
		
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
			//bos.flush();
		}
		
		bis.close();
		bos.close();
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Music/李袁杰 - 迷梦.mp3");//创建输入流对象，关联。MP3
		FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Music/copy2.mp3");//创建输出流对象，关联copy2.mp3
		BufferedInputStream bis=new BufferedInputStream(fis);//创建缓冲区对象，对输入流进行包装
		BufferedOutputStream bos=new BufferedOutputStream(fos);//创建缓冲区对象，对输出流进行包装
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		
		bos.close();
		bis.close();
	}
}
