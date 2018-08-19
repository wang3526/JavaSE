package day25.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2_Reflect {
	/**
	 * * ե֭��(Juicer)ե֭�İ���
	 	* �ֱ���ˮ��(Fruit)ƻ��(Apple)�㽶(Banana)����(Orange)ե֭(squeeze)
	 * @throws Exception 
	 * 
	 * */
	public static void main(String[] args) throws Exception {
		//�÷���������ļ�
		BufferedReader br=new BufferedReader(new FileReader("config.properties"));
		Class clazz=Class.forName(br.readLine());
		/**newInstance() �����ɴ� ������ʾ�������ʵ����**/
		Fruit f=(Fruit)clazz.newInstance();  //��������ָ���������
		Juicer j=new Juicer();
		j.run(f);
		
		
		//û���÷��䣬ֻ��˵��̬
		/*Juicer j=new Juicer();       //����ե֭��
		j.run(new Apple());          //��ե֭���з���ƻ��
		j.run(new Orange());*/
	}
}

interface Fruit{
	public void squeeze();
}

class Apple implements Fruit{
	@Override
	public void squeeze(){
		System.out.println("ե��һ��ƻ��֭");
	}
}

class Orange implements Fruit{
	@Override
	public void squeeze(){
		System.out.println("ե��һ������֭");
	}
}

class Banana implements Fruit{
	@Override
	public void squeeze() {
		System.out.println("ե��һ���㽶֭");
	}
}

class Juicer{
	public void run(Fruit f){
		f.squeeze();
	}
}