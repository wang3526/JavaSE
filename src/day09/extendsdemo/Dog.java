package day09.extendsdemo;

public class Dog extends Animal{
	public Dog(){
		System.out.println("Dog无参构造");
	}
	
	public Dog(String name){
		super(name);
		System.out.println("Dog有参构造");
	}
	
	public void swim(){
		System.out.println("游泳");
	}
}
