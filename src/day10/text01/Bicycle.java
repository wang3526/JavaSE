package day10.text01;
/**
 * ������
 * */
public class Bicycle extends Car{
	public Bicycle() {
	}
	public Bicycle(int time){
		this.setPrice(0.6);
		this.setTime(time);
	}
	@Override
	public void fare() {
		if(this.getTime()%60!=0){
			int hour=this.getTime()/60+1;
			this.setFare(this.getPrice()*hour);
		}else{
			int hour=this.getTime()/60;
			this.setFare(this.getPrice()*hour);
		}
		System.out.println("��������"+this.getFare());
	}

}
