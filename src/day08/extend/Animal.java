package day08.extend;

public class Animal {
	String color;
	int leg;
	
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}
	
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.color="��ɫ";
		cat.leg=4;
		cat.eat();
		cat.sleep();
		System.out.println("��ɫ��"+cat.color+"��"+cat.leg);
	}
}
class Cat extends Animal{
	
}