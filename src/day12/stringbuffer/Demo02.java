package day12.stringbuffer;
/**
 *  A:StringBuffer����ӹ���
	* public StringBuffer append(String str):
		* ���԰���������������ӵ��ַ�������������,�������ַ�������������
	* public StringBuffer insert(int offset,String str):
		* ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
 	StringBuffer���ַ�������������new��ʱ�����ڶ��ڴ洴����һ�����󣬵ײ���
 	һ������Ϊ16���ַ����飬��������ӵķ���ʱ�����������´��������ڲ�����ԭ����������ַ�
 * */

public class Demo02 {
	public static void main(String[] args) {
		//demo();
		StringBuffer sb=new StringBuffer("1234");
		sb.insert(3, "heima");   //��ָ��λ�����Ԫ�أ����û��ָ��λ�õ������ͻᱨ����Խ���쳣
		System.out.println(sb);
	}

	private static void demo() {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		StringBuffer sb2=sb.append(true);
		System.out.println(sb2);
		StringBuffer sb3=sb2.append("heima");
		System.out.println(sb3);
		StringBuffer sb4=sb3.append(100);
		
		System.out.println(sb.toString());   //StringBuffer������д��toString()��������ʾ���Ƕ����Ԫ��ֵ 
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}
}
