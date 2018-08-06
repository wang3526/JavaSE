package day08.setinit;

public class User {
	// 属性
	private String name; // 姓名
	private int age; // 年龄
	// 方法

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//默认构造方法
	public User(){
		
	}
	
	public User(String name,int age){
		//this.name=name;
		//this.age=age;
		setName(name);
		setAge(age);
	}
	
	public static void main(String[] args) {
		//初始化一个对象，同时给对象属性赋值   有两种方式
		//1、通过setter注入
			//1.1初始化对象
			User user=new User();
			//1.2给对象的属相进行赋值
			user.setName("小乔");
			user.setAge(18);
			System.out.println(user.getName()+" "+user.getAge());
			
		//2、通过构造方法赋值
			User user1=new User("大乔",20);
			System.out.println(user1.getName()+" "+user1.getAge());
		/**总结：当初始化对象的时候，对象的属性比较少的情况下，通过构造方法给对象的属性进行赋值
			当初始化对象的时候，对象的属性比较多的情况下，通过setter方法给对象的属性进行赋值*/
	}
	
}
