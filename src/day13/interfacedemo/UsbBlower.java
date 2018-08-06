package day13.interfacedemo;
/**
 * Usb风扇
 * */
public class UsbBlower implements UsbInterface{

	@Override
	public void loadDrive() {
		System.out.println("Usb风扇加载驱动");
	}

	@Override
	public void wrok() {
		System.out.println("Usb风扇工作");
	}
	
}
