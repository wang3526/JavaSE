package day13.interfacedemo;
/**
 * Usb鼠标
 * */
public class UsbMouse implements UsbInterface{

	@Override
	public void loadDrive() {
		System.out.println("Usb鼠标加载驱动");
	}

	@Override
	public void wrok() {
		System.out.println("Usb鼠标读/写");
	}

}
