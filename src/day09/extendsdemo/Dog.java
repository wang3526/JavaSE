package day09.extendsdemo;

public class Dog extends Animal{
	public Dog(){
		System.out.println("Dog�޲ι���");
	}
	
	public Dog(String name){
		super(name);
		System.out.println("Dog�вι���");
	}
	
	public void swim(){
		System.out.println("��Ӿ");
	}
}
