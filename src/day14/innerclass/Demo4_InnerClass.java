package day14.innerclass;

interface UsbInterface{
	void method();
}
public class Demo4_InnerClass {
	public static void methodA(UsbInterface face){
		face.method();
	}
	public static void main(String[] args) {
		/**
		 * 匿名内部类
		 * */
		UsbInterface face=new UsbInterface() {
			@Override
			public void method() {
				System.out.println("匿名内部类");
				
			}
		};
		methodA(face);
	}
}
