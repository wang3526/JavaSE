package day08;

public class Circle {
	private Drop drop;     //��
	private Drop raDrop;   //Բ��
	private int radius; //�뾶
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
			return "��Բ��";
		}else if(tmp<0){
			return "��Բ��";
		}
		return "��Բ��";
	}
	
	public static void main(String[] args) {
		//����Բ�Ķ���
		Drop raDrop=new Drop(0,5);
		Circle circle=new Circle(5,raDrop);
		//���������
		Drop drop=new Drop(0,0);
		String msg=circle.dropToCircle(drop);
		System.out.println(msg);
	}

}

class Drop{
	private int x;   //x����
	private int y;   //y����
	
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