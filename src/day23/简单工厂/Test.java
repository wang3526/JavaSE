package day23.�򵥹���;

public class Test {
	public static void main(String[] args) {
		//Dog d=AnimalFactory.createDog();
		
		Dog d=(Dog)AnimalFactory.createAnimal("dog");
		d.eat();
		Cat c=(Cat)AnimalFactory.createAnimal("cat");
		c.eat();
	}
}
