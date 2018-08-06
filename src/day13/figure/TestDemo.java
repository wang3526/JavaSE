package day13.figure;

public class TestDemo {
	public static double calArea(FigureInterface face){
		return face.Area();
	}
	
	public static void main(String[] args) {
		Circle circle=new Circle(3);
		double area1=calArea(circle);
		System.out.println(area1);
		Rectangle rectangle=new Rectangle(4,6);
		double area2=calArea(rectangle);
		System.out.println(area2);
	}
}
