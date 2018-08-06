package day10.text01;
/**
 * ������
 * */
public class AutoCar extends Car{
	private int course;   //���
	
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public AutoCar() {
	}
	public AutoCar(int time,int course){
		this.setPrice(1);
		this.setTime(time);
		this.setCourse(course);
	}
	@Override
	public void fare() {
		if(this.course<10){
			if(this.getTime()%10!=0){
				int count=this.getTime()/10+1;
				this.setFare(this.getPrice()*count);
			}else{
				int count=this.getTime()/10;
				this.setFare(this.getPrice()*count);
			}
		}else{
			if(this.getTime()%10!=0){
				int count=this.getTime()/10+1;
				this.setFare(this.getPrice()*count+(course-10));
			}else{
				int count=this.getTime()/10;
				this.setFare(this.getPrice()*count+(course-10));
			}
		}
		System.out.println("������������"+this.getFare());
	}
}
