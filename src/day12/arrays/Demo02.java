package day12.arrays;
/**
 * * A:int -- String
	* a:��""����ƴ��
	* b:public static String valueOf(int i)
	* c:int -- Integer -- String(Integer���toString����())
	* d:public static String toString(int i)(Integer��ľ�̬����)
* B:String -- int
	* a:String -- Integer -- int
	* public static int parseInt(String s)
�����������Ͱ�װ���а��֣��������ֶ���parseXXX�ķ�����
���Խ������ֵ��ַ���������ʽת���ɻ����������� * */
public class Demo02 {
	public static void main(String[] args) {
		//demo();
		//demo1();
		String s1="true";
		boolean b=Boolean.parseBoolean(s1);
		System.out.println(b);
		
		//String s2="abc";
		//char c=Character.p    //char�İ�װ��Character��û��parseXXX�ķ���
		                     //�ַ������ַ���װ��ͨ��toCharArray�����Ϳ��԰��ַ���ת�����ַ�����
	}

	private static void demo1() {
		//String  --->int    Stringת��int
		String s1="200";
		Integer i1=new Integer(s1);
		int i2=i1.intValue();    //��Integerת����int
		
		int i3=Integer.parseInt(s1); //��Stringת��Ϊint,�Ƽ�������
	}

	private static void demo() {
		//int ---->String   intת����String
		int i=100;
		String s1=i+"";          //�Ƽ���
		String s2=String.valueOf(i); //�Ƽ���
		
		System.out.println(s2);
		Integer i2=new Integer(i);
		String s3=i2.toString();
		
		String s4=Integer.toString(i);
		System.out.println(s1);
	}
}
