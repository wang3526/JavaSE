package day13.figure;
/**
 * ������
 * */
public class Rectangle implements FigureInterface{
	private int width;    //��
	private int length;   //��
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public Rectangle(){
		
	}
	
	public Rectangle(int width,int length){
		this.width=width;
		this.length=length;
	}
	@Override
	public double Area() {
		return this.width*this.length;
	}

}
