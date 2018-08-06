package day13.shape;

public class TestDemo {
	public static double sumMoney(ShapeInterface face){
		return face.sumMoney();
	}
	
	public static void main(String[] args) {
		ShapeBike sb=new ShapeBike(0.6,70);
		double sum=sumMoney(sb);
		System.out.println(sum);
		ShapeCar sc=new ShapeCar(1,41,12);
		double sum1=sumMoney(sc);
		System.out.println(sum1);
	}
}
