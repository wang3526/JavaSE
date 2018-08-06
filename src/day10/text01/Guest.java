package day10.text01;

public class Guest {
	public void way(Car car){
		if(car instanceof Bicycle){
			Bicycle bicycle=(Bicycle)car;
			bicycle.fare();
		}else if(car instanceof AutoCar){
			AutoCar autoCar=(AutoCar)car;
			autoCar.fare();
		}
	}
	public static void main(String[] args) {
		Guest guest=new Guest();
		Bicycle bicycle=new Bicycle(65);
		guest.way(bicycle);
		AutoCar autoCar=new AutoCar(45, 12);
		guest.way(autoCar);

	}

}
