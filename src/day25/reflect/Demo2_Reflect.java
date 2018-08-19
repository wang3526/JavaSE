package day25.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2_Reflect {
	/**
	 * * 榨汁机(Juicer)榨汁的案例
	 	* 分别有水果(Fruit)苹果(Apple)香蕉(Banana)桔子(Orange)榨汁(squeeze)
	 * @throws Exception 
	 * 
	 * */
	public static void main(String[] args) throws Exception {
		//用反射和配置文件
		BufferedReader br=new BufferedReader(new FileReader("config.properties"));
		Class clazz=Class.forName(br.readLine());
		/**newInstance() 创建由此 类对象表示的类的新实例。**/
		Fruit f=(Fruit)clazz.newInstance();  //父类引用指向子类对象
		Juicer j=new Juicer();
		j.run(f);
		
		
		//没有用反射，只在说多态
		/*Juicer j=new Juicer();       //购买榨汁机
		j.run(new Apple());          //向榨汁机中放入苹果
		j.run(new Orange());*/
	}
}

interface Fruit{
	public void squeeze();
}

class Apple implements Fruit{
	@Override
	public void squeeze(){
		System.out.println("榨出一杯苹果汁");
	}
}

class Orange implements Fruit{
	@Override
	public void squeeze(){
		System.out.println("榨出一杯桔子汁");
	}
}

class Banana implements Fruit{
	@Override
	public void squeeze() {
		System.out.println("榨出一杯香蕉汁");
	}
}

class Juicer{
	public void run(Fruit f){
		f.squeeze();
	}
}