package day10.text;
/**
 * 需求说明
	宠物饿了，主人需要为宠物喂食，使用多态实现该过程
	不同宠物吃的东西不一样
	不同宠物吃完东西后恢复健康值不一样
	健康值达到100时，不需要继续喂食
	狗+3     企鹅+5
 * */
/**
 * 宠物类
 * */
public abstract class Pet {
	private int health;    //健康值
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void eat();           //吃
}
