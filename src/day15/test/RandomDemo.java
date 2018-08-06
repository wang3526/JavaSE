package day15.test;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random random=new Random();
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10)+10);
		System.out.println((int)(random.nextDouble()*10));
		System.out.println((int)(random.nextDouble()*10)+10);
		
	}
}
