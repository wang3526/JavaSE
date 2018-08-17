package day24.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//如果该类要支持序列化技术，必须实现接口Serializable
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
	 * 序列化：对象 通过编码技术转换成二进制数据，存储起来
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * */
	public static void writeObj() throws IOException{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("xxx.txt"));
		oos.writeChar('a');
		Student stu=new Student("张三");
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
