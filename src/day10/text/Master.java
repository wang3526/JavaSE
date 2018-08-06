package day10.text;
/**
 * Ö÷ÈËÀà
 * */
public class Master {
	public void feed(Pet pet){
		while(pet.getHealth()<100){
			pet.eat();
		}
	}
	public static void main(String[] args) {
		Master master=new Master();
		Dog dog=new Dog(80);
		master.feed(dog);
		Penguin pen=new Penguin(76);
		master.feed(pen);
	}
}
