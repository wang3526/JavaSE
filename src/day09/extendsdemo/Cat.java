package day09.extendsdemo;

public class Cat extends Animal{
	public Cat(){
		System.out.println("Cat无参构造");
	}
	
	public Cat(String name){
		super(name);
		System.out.println("Cat有参构造");
	}
	
	public void catchMice(){
		System.out.println("捉了一只老鼠");
	}
}
