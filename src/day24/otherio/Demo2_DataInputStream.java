package day24.otherio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_DataInputStream {
	/**
	 * DataInputStream 
	 * 二进制输入流，可以读取文件，将文件中对应数据类型还原成java基本数据类型
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//创建DataInputStream对象
		DataInputStream dis=new DataInputStream(new FileInputStream("xxx.txt"));
	
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		System.out.println(dis.readUTF());
		
		dis.close();
	}
}
