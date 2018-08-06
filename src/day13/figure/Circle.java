package day13.figure;
/**
 * Բ��
 * */
public class Circle implements FigureInterface{
	private int r;      //�뾶
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public Circle(){
		
	}
	
	public Circle(int r){
		this.r=r;
	}
	@Override
	public double Area() {
		return Math.PI*Math.pow(this.r,2);
	}

}
