package day10.text;
/**
 * 狗类
 * */
public class Dog extends Pet{
	//构造方法
	public Dog(){
		
	}
	public Dog(int health){
		this.setHealth(health);
	}
	//重写父类方法
	@Override
	public void eat() {
		if(this.getHealth()<100){
			this.setHealth(this.getHealth()+3);
			System.out.println("吃了狗粮，健康值+3");	
		}
		if(this.getHealth()>=100){
			this.setHealth(100);
			System.out.println("狗狗已经吃饱了");
			System.out.println("当前健康值为："+this.getHealth());
		
		}
	}
}
