package day10.poly;
/**
 * 买家类
 * */
public class Guest {
	//买商品
	public static Goods buy(int type){
		if(type==1){
			TVs tVs=new TVs("海尔", 2300);
			return tVs;
		}
		Foods foods=new Foods("三只松鼠腰果",13);
		return foods;
		
	}
	
	public static void main(String[] args) {
		buy(1).print();
		buy(2).print();
	}
}
