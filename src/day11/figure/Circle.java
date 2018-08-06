package day11.figure;
/**
 * ‘≤¿‡
 * */
public class Circle extends Figure{
	private double r;
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double Area() {
		return 3.14*r*r;
	}

}
