package day13.interfacedemo;
/**
 * U��
 * */
public class UDisk implements UsbInterface{

	@Override
	public void loadDrive() {
		System.out.println("U�̼�������");
	}

	@Override
	public void wrok() {
		System.out.println("U�̶�/д");
	}

}
