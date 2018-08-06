package day10.poly;
/**
 * 电视类
 * */
public class TVs extends Goods{
	//构造方法
	public TVs(){
		
	}
	public TVs(String name,int price){
		this.setName(name);
		this.setPrice(price);
	}
	//重写父类打印方法
	@Override
	public void print() {
		System.out.println(this.getName()+"的价格是："+this.getPrice());
	}
}
