package day20.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {
	/**
	 * @throws IOException 
	 * FileOutputStream�ڴ��������ʱ�����û������ļ�����Ҵ�������
	 * ����л���գ���д��
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fos=new FileOutputStream("yyy.txt",true);//�������д�����ڵڶ���������true
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		fos.close();
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos=new FileOutputStream("yyy.txt");//�����ֽ�������������û�о��Զ�����һ��
		/*fos.write(97);//��Ȼд������һ��int�������ǻ��Զ�ȥ��ǰ3����λ
		fos.write(98);
		fos.write(99);*/
		fos.write(100);
		
		
		fos.close();
	}
}
