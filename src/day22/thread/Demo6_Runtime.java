package day22.thread;

import java.io.IOException;

public class Demo6_Runtime {
	public static void main(String[] args) throws IOException {
		Runtime r=Runtime.getRuntime();  //��ȡRuntime����
		//r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}
}
