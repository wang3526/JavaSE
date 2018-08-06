package day09.StudentDemo;

public class TestDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student(123,"小乔",18);
		Student stu2=new Student(123,"小乔",20);
		int i=0;
		if(stu1.equals(i)){
			System.out.println("是同一个对象");
		}else{
			System.out.println("不是同一个对象");
		}
	}
}
