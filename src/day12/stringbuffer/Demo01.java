package day12.stringbuffer;
/**
 * * A:StringBuffer�Ĺ��췽����
	* public StringBuffer():�޲ι��췽��
	* public StringBuffer(int capacity):ָ���������ַ�������������
	* public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
* B:StringBuffer�ķ�����
	* public int capacity()�����ص�ǰ������	����ֵ(������)
	* public int length():���س��ȣ��ַ������� ʵ��ֵ
 * */
public class Demo01 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());   //�����е��ַ�������ʵ��ֵ
		System.out.println(sb.capacity()); //�����еĳ�ʼ����������ֵ
		
		StringBuffer sb2=new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3=new StringBuffer("heima");
		System.out.println(sb3.length());	 //ʵ���ַ��ĸ���
		System.out.println(sb3.capacity());  //�ַ�����length+��ʼ����
	}
}
 