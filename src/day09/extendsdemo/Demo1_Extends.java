package day09.extendsdemo;

public class Demo1_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemothB demothB=new DemothB(18);
		//demothB.show();
	}

}

class DemothA{
	public DemothA(){
		System.out.println("父类无参构造");
	}
	public DemothA(String name){
		System.out.println(name+"有参构造");
	}
	public void show(){
		System.out.println("Hello World！");
	}
}

class DemothB extends DemothA{
	public DemothB(){
		//super.show();  //调用父类的成员方法
		//super("小乔");
		System.out.println("子类无参构造");
	}
	
	public DemothB(int age){
		super();    //这是一条语句，如果不写，系统会默认加上，用来访问父类中的空参构造方法
		System.out.println("子类有参构造");
	}
	
	public void show(){
		System.out.println("fvfdsver");
	}
}
