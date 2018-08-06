package day13.shape;
/**
 * 共享汽车
 * 总价=单价*时间+里程         时间不满10分钟按10分钟计算，超出10公里加1元
 * */
public class ShapeCar extends Car implements ShapeInterface{
	private int course;    //里程
	
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
	public ShapeCar() {
		// TODO Auto-generated constructor stub
	}
	
	public ShapeCar(double price,int time,int course){
		this.setPrice(price);
		this.setTime(time);
		this.course=course;
	}
	@Override
	public double sumMoney() {
		int count=this.getTime()%10!=0 ? this.getTime()/10+1 : this.getTime()/10;
		if(this.getCourse()>10)
			return this.getPrice()*count+getCourse()-10;
		else 
			return this.getPrice()*count;
	}

}
