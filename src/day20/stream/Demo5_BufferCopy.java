package day20.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {
	/**
	 * close����
	 * ����ˢ�µĹ��ܣ��ڹر���֮ǰ���ͻ���ˢ��һ�λ������������������ֽ�ȫ��ˢ�µ��ļ��ϣ�
	 * �ڹرգ�close������ˢ��֮��Ͳ���д��
	 * flush����
	 * �߱�ˢ�µĹ��ܣ�ˢ��֮�󻹿��Լ���д
	 * */
	public static void main(String[] args) throws IOException {
		//demo1();
		/**flush��close����������**/
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("��Ԭ�� - ����.mp3"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy2.mp3"));
		
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
			//bos.flush();
		}
		
		bis.close();
		bos.close();
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("C:/Users/Administrator/Music/��Ԭ�� - ����.mp3");//�������������󣬹�����MP3
		FileOutputStream fos=new FileOutputStream("C:/Users/Administrator/Music/copy2.mp3");//������������󣬹���copy2.mp3
		BufferedInputStream bis=new BufferedInputStream(fis);//�������������󣬶����������а�װ
		BufferedOutputStream bos=new BufferedOutputStream(fos);//�������������󣬶���������а�װ
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		
		bos.close();
		bis.close();
	}
}
