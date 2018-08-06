package day13.interfacedemo;

public class TestDemo {
	public static void method(UsbInterface face){
		face.loadDrive();
		face.wrok();
	}
	
	public static void main(String[] args) {
		UsbBlower ub=new UsbBlower();
		UsbMouse um=new UsbMouse();
		UDisk ud=new UDisk();
		method(ub);
		method(um);
		method(ud);
	}
}
