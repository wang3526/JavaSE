package day14.otherclass;

import java.util.Random;

public class Demo_Random {
	/**
	 * * A:Random��ĸ���
			* �������ڲ���������������ͬ�����Ӵ������� Random ʵ����
			* ���ÿ��ʵ��������ͬ�ķ����������У����ǽ����ɲ�������ͬ���������С�
		* B:���췽��
			* public Random()
			* public Random(long seed)
		* C:��Ա����
			* public int nextInt()
			* public int nextInt(int n)(�ص�����)
	 * */
	public static void main(String[] args) {
		Random r=new Random();
		/*int i=r.nextInt();
		System.out.println(i);*/
		
		for (int i = 0; i < 10; i++) {
			//System.out.println(r.nextInt());
			System.out.println(r.nextInt(100));//����[0-n)�������
		}
		
		/**
		 * -1244746321
			1060493871
			
			-1244746321
			 1060493871
		 * */
/*		Random r2=new Random(1000);
		int a=r2.nextInt();
		int b=r2.nextInt();
		System.out.println(a);
		System.out.println(b);*/
	}
}
