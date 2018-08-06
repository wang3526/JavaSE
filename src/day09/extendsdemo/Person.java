package day09.extendsdemo;
/**
 * 父类
 * 存放子类公共的特性和行为
 */
public class Person {
	//公共属性
	String name;   //姓名
	int age;       //年龄
	
	public Person(){
		System.out.println("父类默认构造");
	}
	public Person(int age){
		System.out.println("父类带参构造");
	}
	//方法
	public void sleep(){
		System.out.println(name+"睡觉");
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		student.sn="123245";
		student.name="小乔";
		student.age=18;
		student.sleep();
		System.out.println(student.sn);
	}
	
}

/**
 * 子类继承父类
 * 可以继承父类公共的特性  属性和方法  如果是私有的不能被继承
 * 继承需要一个关键字extends
 * Java中只支持单根继承（只有一个亲生父亲）
 * 
 * 子类可以拥有自己特有的特性
 * */
class Student extends Person{
	//特有属性
	String sn;     //学号
	
	public Student(){
		super(18);
		System.out.println("子类默认构造");
	}
	
	public Student(int sn){
		System.out.println("子类带参构造");
	}
	
}

class Teacher extends Person{
	//特有属性
	String level;   //级别
}

class Employee extends Person{
	//特有属性
	String date;    //入职时间
}















