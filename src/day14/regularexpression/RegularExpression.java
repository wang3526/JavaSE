package day14.regularexpression;

public class RegularExpression {
/**
 * * A:������ʽ
		* ��ָһ��������������ƥ��һϵ�з���ĳ���﷨������ַ����ĵ����ַ�������ʵ����һ�ֹ������Լ������Ӧ�á�
		* ����:����ע������,�������û���������,һ���������Ƴ���,������Ƴ��ȵ��������������ʽ����
	* B:������ʾ
		* ����У��qq����.
			* 1:Ҫ�������5-15λ����
			* 2:0���ܿ�ͷ
			* 3:���붼������
			
 * a:��������ʽʵ��	
		* b:������ʽʵ��
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkQQ("1432555364"));
		
		
		String regex="[1-9]\\d{4,14}";
		System.out.println("23424e3523".matches(regex));
	}
	/**
	 * 	* ����У��qq����.
			* 1:Ҫ�������5-15λ����
			* 2:0���ܿ�ͷ
			* 3:���붼������
		������
			1����ȷ����ֵ����Boolean 
			2����ȷ�����б�String qq 
	 * */
	public static boolean checkQQ(String qq){
		boolean flag=true;  //���У��qq������Ҫ��Ͱ�flag��Ϊfalse,�������Ҫ��ֱ�ӷ���true
		
		if(qq.length()>=5&&qq.length()<=15){
			if(!qq.startsWith("0")){
				char[] arr=qq.toCharArray(); //���ַ���ת�����ַ�����
				for(int i=0;i<arr.length;i++){
					char ch=arr[i];   //��¼ÿһ���ַ�
					if(!(ch>='0'&&ch<='9')){
						flag=false;
						break;
					}
				}
			}else{
				flag=false;    //��0��ͷ��������qq��׼
			}
		}else{
			flag=false;    //���Ȳ�����
		}
		return flag;
	}
}
