package day10.text01;
/**
 * 需求
 * 单车：车费=时间*单价  1h/0.6元  按分钟计时，不满一小时也收费0.6元
 * 汽车：车费=时间*单价+里程 10分钟/1元   超出10里程+1元
 * */
/**
 * 车类
 * */
public abstract class Car {
	private double fare;    //车费
	private int time;       //时间
	private double price;      //单价
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public abstract void fare();
}
