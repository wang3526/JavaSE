package day09.extendsdemo;

public class Animal {
	private String name;  //名字
	private double height;//体重
	private int egg;      //腿
	private String color; //颜色
	
	public Animal(){
		System.out.println("Animal无参构造");
	}
	
	public Animal(String name){
		this();
		this.name=name;
		System.out.println("Animal有参构造");
	}
	
	public void sleep(){
		System.out.println(name+":睡觉");
	}
}
