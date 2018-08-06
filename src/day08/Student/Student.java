package day08.Student;

public class Student {
	private String name;
	private int age;
	
	public Student(){}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void show(){
		System.out.println("我的姓名是："+name+",我的年龄是："+age);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("张三");
		s1.setAge(18);
		System.out.println("我的姓名是："+s1.getName()+",我的年龄是："+s1.getAge());
		Student s2=new Student("李四",24);
		s2.show();
	}
}
