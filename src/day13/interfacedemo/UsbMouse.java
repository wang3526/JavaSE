package day13.interfacedemo;
/**
 * Usb���
 * */
public class UsbMouse implements UsbInterface{

	@Override
	public void loadDrive() {
		System.out.println("Usb����������");
	}

	@Override
	public void wrok() {
		System.out.println("Usb����/д");
	}

}
