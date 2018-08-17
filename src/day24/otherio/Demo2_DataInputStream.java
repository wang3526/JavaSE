package day24.otherio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_DataInputStream {
	/**
	 * DataInputStream 
	 * �����������������Զ�ȡ�ļ������ļ��ж�Ӧ�������ͻ�ԭ��java������������
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//����DataInputStream����
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
