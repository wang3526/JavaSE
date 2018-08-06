package day08;

public class Circle {
	private Drop drop;     //点
	private Drop raDrop;   //圆心
	private int radius; //半径
	public Drop getRaDrop() {
		return raDrop;
	}

	public void setRaDrop(Drop raDrop) {
		this.raDrop = raDrop;
	}

	public Drop getDrop() {
		return drop;
	}

	public void setDrop(Drop drop) {
		this.drop = drop;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle(){}
	public Circle(int radius,Drop raDrop){
		setRadius(radius);
		setRaDrop(raDrop);
	}
	private String dropToCircle(Drop drop){
		int x=this.raDrop.getX()-drop.getX();
		int y=this.raDrop.getY()-drop.getY();
		int tmp=x*x+y*y-radius*radius;
		if(tmp>0){
			return "在圆外";
		}else if(tmp<0){
			return "在圆内";
		}
		return "在圆上";
	}
	
	public static void main(String[] args) {
		//创建圆心对象
		Drop raDrop=new Drop(0,5);
		Circle circle=new Circle(5,raDrop);
		//创建点对象
		Drop drop=new Drop(0,0);
		String msg=circle.dropToCircle(drop);
		System.out.println(msg);
	}

}

class Drop{
	private int x;   //x坐标
	private int y;   //y坐标
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Drop(){}
	public Drop(int x,int y){
		setX(x);
		setY(y);
	}
}