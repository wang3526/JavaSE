package day12.stringbuffer;
/**
 * A:String -- StringBuffer
	* a:ͨ�����췽��
	* b:ͨ��append()����
* B:StringBuffer -- String
	* a:ͨ�����췽��
	* b:ͨ��toString()����
	* c:ͨ��subString(0,length);
 * */
public class Demo06 {
	public static void main(String[] args) {
		//demo();
		StringBuffer sb1=new StringBuffer("heima");
		
		String s1=new String(sb1);
		System.out.println(s1);//ͨ�����췽����StringBufferװ��ΪString
		
		String s2=sb1.toString();
		System.out.println(s2);//ͨ��toString������StringBufferת����String
		
		String s3=sb1.substring(0, sb1.length());
		System.out.println(s3);//ͨ��subString������ȡ��StringBufferװ��ΪString
	}

	private static void demo() {
		StringBuffer sb=new StringBuffer("heima");//ͨ�����췽�����ַ���װ����StringBuffer����
		System.out.println(sb);
		
		StringBuffer sb2=new StringBuffer();
		sb2.append("heima"); //ͨ��append�������ַ���ת����StringBuffer����
		System.out.println(sb2);
	}
}
