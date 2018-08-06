package day13.shape;
/**
 * 共享单车
 * 总价=单价*小时       不满60分钟按一小时计算    
 * */
public class ShapeBike extends Car implements ShapeInterface{
	public ShapeBike(){
		
	}
	
	public ShapeBike(double price,int time){
		this.setPrice(price);
		this.setTime(time);
	}
	@Override
	public double sumMoney() {
		int hour=this.getTime()%60!=0 ? this.getTime()/60+1 : this.getTime()/60;
		return this.getPrice()*hour;
	}
	

}
