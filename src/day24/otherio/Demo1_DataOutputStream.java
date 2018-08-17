package day24.otherio;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_DataOutputStream {
	/**
	 * DataOutputStream
	 * ����������������Խ�java������������ֱ��д�뵽�ļ�
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		//����һ��DataOutputStream����
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("xxx.txt"));
		
		//д������
		dos.writeBoolean(true);//д��Booleanֵ����
		dos.writeByte(3);  //д��һ���ֽ�����
		dos.writeChar('a');//д��һ���ַ�����
		dos.writeDouble(11.2);//д��һ��double����
		dos.writeFloat(12.3f);//д��һ��float����
		dos.writeLong(12L);  //д��long����
		dos.writeShort(12);//д��short����
		dos.writeUTF("hello");//д��String����
		
		//ˢ������
		dos.flush();
		//�ر���
		dos.close();
		
		
	}
}
