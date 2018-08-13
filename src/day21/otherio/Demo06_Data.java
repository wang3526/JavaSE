package day21.otherio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06_Data {
	/**
	 * 00000000 00000000 00000011 11100101   int¿‡–Õ997
	 * 11100101
	 * 00000000 00000000 00000000 11100101
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//demo3();
		DataInputStream dis=new DataInputStream(new FileInputStream("bbb.txt"));
		int x=dis.readInt();
		int y=dis.readInt();
		int z=dis.readInt();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		dis.close();
		
		
	}

	private static void demo3() throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("bbb.txt"));
		dos.writeInt(997);
		dos.writeInt(998);
		dos.writeInt(999);
		
		dos.close();
	}

	private static void demo2() throws IOException {
		FileInputStream fis=new FileInputStream("bbb.txt");
		int x=fis.read();
		int y=fis.read();
		int z=fis.read();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		fis.close();
	}

	private static void demo1() throws IOException {
		FileOutputStream fos=new FileOutputStream("bbb.txt");
		fos.write(997);
		fos.write(998);
		fos.write(999);
		
		fos.close();
	}
}
