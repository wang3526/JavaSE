package day10.poly;
/**
 * 食品类
 * */
public class Foods extends Goods{
	//构造方法
	public Foods() {
	}
	public Foods(String name,int price){
		this.setName(name);
		this.setPrice(price);
	}
	//重写父类打印方法
	@Override
	public void print() {
		System.out.println(this.getName()+"的价格是："+this.getPrice());
	}
	
}
