package day12.stringbuffer;
/**
 * A:StringBuffer�Ľ�ȡ����
	* public String substring(int start):
		* ��ָ��λ�ý�ȡ��ĩβ
	* public String substring(int start,int end):
		* ��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��
* B:ע������
	* ע��:����ֵ���Ͳ�����StringBuffer����
 * */
public class Demo05 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("woaiheima");
		//String str=sb.substring(4);
		//System.out.println(str);
		//System.out.println(sb);
		
		String str2=sb.substring(4, 7);
		System.out.println(str2);
	}
}
