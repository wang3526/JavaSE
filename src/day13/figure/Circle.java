package day13.figure;
/**
 * Ô²Àà
 * */
public class Circle implements FigureInterface{
	private int r;      //°ë¾¶
	
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
