package day09.extendsdemo;

public class Cat extends Animal{
	public Cat(){
		System.out.println("Cat�޲ι���");
	}
	
	public Cat(String name){
		super(name);
		System.out.println("Cat�вι���");
	}
	
	public void catchMice(){
		System.out.println("׽��һֻ����");
	}
}
