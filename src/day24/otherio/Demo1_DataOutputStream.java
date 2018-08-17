package day24.otherio;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_DataOutputStream {
	/**
	 * DataOutputStream
	 * 二进制输出流，可以将java基本数据类型直接写入到文件
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//创建一个DataOutputStream对象
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("xxx.txt"));
		
		//写入数据
		dos.writeBoolean(true);//写入Boolean值类型
		dos.writeByte(3);  //写入一个字节类型
		dos.writeChar('a');//写入一个字符类型
		dos.writeDouble(11.2);//写入一个double类型
		dos.writeFloat(12.3f);//写入一个float类型
		dos.writeLong(12L);  //写入long类型
		dos.writeShort(12);//写入short类型
		dos.writeUTF("hello");//写入String类型
		
		//刷入数据
		dos.flush();
		//关闭流
		dos.close();
		
		
	}
}
