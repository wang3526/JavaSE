package day11.figure;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle();
		circle.setR(3.0);
		System.out.println(circle.Area());
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(3.0);
		rectangle.setWidth(2.0);
		System.out.println(rectangle.Area());
	}

}
