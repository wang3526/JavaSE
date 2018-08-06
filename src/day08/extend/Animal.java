package day08.extend;

public class Animal {
	String color;
	int leg;
	
	public void eat(){
		System.out.println("³Ô·¹");
	}
	
	public void sleep(){
		System.out.println("Ë¯¾õ");
	}
	
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.color="»ÆÉ«";
		cat.leg=4;
		cat.eat();
		cat.sleep();
		System.out.println("ÑÕÉ«£º"+cat.color+"ÍÈ"+cat.leg);
	}
}
class Cat extends Animal{
	
}