package day14.otherclass;

public class Demo_System {
	/**
	 * * A:System��ĸ���
			* System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
		* B:��Ա����
			* public static void gc()
			* public static void exit(int status)
			* public static long currentTimeMillis()
			* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		* C:������ʾ
			* System��ĳ�Ա����ʹ��
	 * */
	public static void main(String[] args) {
		//demo();
		//demo2();
		//demo3();
		int[] src={11,22,33,44,55};
		int[] dest=new int[8];
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]+" ");
		}
		System.out.println();
		System.arraycopy(src, 0, dest, 0, src.length);//���������ݿ���
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]+" ");
		}
	}

	private static void demo3() {
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		long end=System.currentTimeMillis();//��ȡ��ǰʱ��ĺ���ֵ
		System.out.println(end-start);
	}

	private static void demo2() {
		System.out.println("111111111111");
		System.exit(0);//��0״̬���쳣��ֹ���˳�JVM
		System.out.println("4555555555555");
	}

	private static void demo() {
		for (int i = 0; i < 100; i++) {
			new Demo();
			System.gc(); //��������������
		}
	}
}

class Demo{   //��һ��Դ�ļ��в�������������public���ε���
	@Override
	protected void finalize(){
		System.out.println("����������");
	}
}