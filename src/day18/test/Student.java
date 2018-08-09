package day18.test;

public class Student {
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;

	public Student() {
		super();
	}

	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum=this.chinese+this.math+this.english;
	}

	public int getSum() {
		return sum;
	}
	
	@Override
	public String toString() {
		return name+","+chinese+","+math+","+english+","+sum;
	}
}
