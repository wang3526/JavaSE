package day12.stringbuffer;
/**
 * * A:StringBuffer���滻����
	* public StringBuffer replace(int start,int end,String str):
		* ��start��ʼ��end��str�滻
  * B:StringBuffer�ķ�ת����
	* public StringBuffer reverse():
		* �ַ�����ת
 * */
public class Demo04 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("�Ұ��ܸ�ϰ");
		//sb.replace(0, 3, "bai"); //�滻
		//System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}