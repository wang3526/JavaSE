package day13.interfacedemo;
/**
 * Usb����
 * */
public class UsbBlower implements UsbInterface{

	@Override
	public void loadDrive() {
		System.out.println("Usb���ȼ�������");
	}

	@Override
	public void wrok() {
		System.out.println("Usb���ȹ���");
	}
	
}
