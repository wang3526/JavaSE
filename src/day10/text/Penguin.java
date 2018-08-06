package day10.text;
/**
 * 企鹅类
 * */
public class Penguin extends Pet{
	//构造方法
	public Penguin() {
	}
	public Penguin(int health){
		this.setHealth(health);
	}
	//重写父类方法
	@Override
	public void eat() {
		if(this.getHealth()<100){
			this.setHealth(this.getHealth()+5);
			System.out.println("企鹅吃鱼，健康值+5");
		}
		if(this.getHealth()>=100){
			this.setHealth(100);
			System.out.println("企鹅已经吃饱了");
			System.out.println("当前健康值为："+this.getHealth());
		}
	}
}
