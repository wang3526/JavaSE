package day15.test;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		ThreadLocalRandom tRandom=ThreadLocalRandom.current();
		System.out.println(tRandom.nextDouble());
		System.out.println((int)tRandom.nextDouble(10, 20));
		System.out.println(tRandom.nextInt(10, 20));
		
		UUID uuid=UUID.randomUUID();
		String str=uuid.toString();
		System.out.println(str);
		System.out.println(str.replace("-", ""));
	}
}
