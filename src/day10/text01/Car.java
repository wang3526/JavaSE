package day10.text01;
/**
 * ����
 * ����������=ʱ��*����  1h/0.6Ԫ  �����Ӽ�ʱ������һСʱҲ�շ�0.6Ԫ
 * ����������=ʱ��*����+��� 10����/1Ԫ   ����10���+1Ԫ
 * */
/**
 * ����
 * */
public abstract class Car {
	private double fare;    //����
	private int time;       //ʱ��
	private double price;      //����
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
