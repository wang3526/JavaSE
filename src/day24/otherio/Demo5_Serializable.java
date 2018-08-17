package day24.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//�������Ҫ֧�����л�����������ʵ�ֽӿ�Serializable
class Student implements Serializable{
	private String name;
	public Student(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}

public class Demo5_Serializable {
	/**
	 * ���л������� ͨ�����뼼��ת���ɶ��������ݣ��洢����
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * */
	public static void writeObj() throws IOException{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("xxx.txt"));
		oos.writeChar('a');
		Student stu=new Student("����");
		oos.writeObject(stu);
		oos.close();
	}
	
	public static void readObj() throws IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("xxx.txt"));
		char a=(char)ois.readChar();
		System.out.println(a);
		Student stu=(Student)ois.readObject();
		System.out.println(stu);
		ois.close();
		
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObj();
		readObj();
	}
}
