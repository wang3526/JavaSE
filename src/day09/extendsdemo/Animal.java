package day09.extendsdemo;

public class Animal {
	private String name;  //����
	private double height;//����
	private int egg;      //��
	private String color; //��ɫ
	
	public Animal(){
		System.out.println("Animal�޲ι���");
	}
	
	public Animal(String name){
		this();
		this.name=name;
		System.out.println("Animal�вι���");
	}
	
	public void sleep(){
		System.out.println(name+":˯��");
	}
}
