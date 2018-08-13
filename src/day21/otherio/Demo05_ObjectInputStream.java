package day21.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import day16.arraylist.Person;

public class Demo05_ObjectInputStream {
	/**
	 * ObjectInputStream
	 * 对象输入流，反序列化
	 * 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//demo1();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("aaa.txt"));
		ArrayList<Person> list=(ArrayList<Person>)ois.readObject();//将整个集合一次读取
		for (Person person : list) {
			System.out.println(person);
		}
		
		ois.close();
	}

	private static void demo1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("aaa.txt"));
		
		Person p1=(Person)ois.readObject();
		Person p2=(Person)ois.readObject();
		//Person p3=(Person)ois.readObject();  //当文件读取到了末尾时出现EOFException
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}
}
