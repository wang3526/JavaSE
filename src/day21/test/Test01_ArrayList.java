package day21.test;

import java.util.ArrayList;

public class Test01_ArrayList {
	/**
	 * 需求说明
		存储多条狗信息，获取狗总数，逐条打印出各条狗信息 
		删除指定位置的狗，如第一个狗
		删除指定的狗
		判断集合中是否包含指定狗
		
		ArrayList
	 * */
	public static void main(String[] args) {
		//创建ArrayList对象
		ArrayList<Dog> list=new ArrayList<Dog>();
		//添加小狗
		Dog dog1=new Dog("欧欧", "雪纳瑞");
		list.add(dog1);
		Dog dog2=new Dog("亚亚", "拉布拉多");
		list.add(dog2);
		Dog dog3=new Dog("菲菲", "拉布拉多");
		list.add(dog3);
		Dog dog4=new Dog("美美", "雪纳瑞");
		list.add(dog4);
		
		//存储多条狗信息，获取狗总数，逐条打印出各条狗信息 
		System.out.println("共计有"+list.size()+"条狗狗");
		System.out.println("分别是：");
		for (Dog dog : list) {
			System.out.println(dog);
		}
		
		System.out.println("删除之前共计有"+list.size()+"条狗狗");
		//删除指定位置的狗，如第一个狗
		list.remove(0);
		
		//删除指定的狗
		list.remove(dog3);
		System.out.println("删除之后还有"+list.size()+"条狗狗");
		for (Dog dog : list) {
			System.out.println(dog);
		}
		
		//判断集合中是否包含指定狗
		if(list.contains(dog4))
			System.out.println("集合中包含"+dog4.getName()+"的信息");
		else
			System.out.println("集合中不包含"+dog4.getName()+"的信息");
	}
}

class Dog{
	private String name;
	private String breed;
	public Dog() {
		super();
	}
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return name+"	"+breed;
	}
}
