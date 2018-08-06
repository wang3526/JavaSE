package day10.poly;
/**
 * 需求说明
	自定义类和方法，使用父类作为返回值实现打印不同类型商品价格功能
	父类：Goods（商品类）
	子类：TVs（电视类）、Foods（食品类）
 * */
/**
 * 商品类
 * */
public abstract class Goods {
	private String name; //名称
	private int price;   //价格

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//打印价格抽象方法
	public abstract void print();
}
