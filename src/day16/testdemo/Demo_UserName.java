package day16.testdemo;

public class Demo_UserName {
	/**
	 * �û���������6-16λ����������ĸ�����»���
	 * */
	public static void main(String[] args) {
		String userName="qWewrw_435672345";
		if(userName.length()>=6 && userName.length()<=16){
			char[] arr=userName.toCharArray(); //װ�����ַ�����
			for (int i = 0; i < arr.length; i++) {
				if(!(arr[i]=='_'||arr[i]>='0'&&arr[i]<='9'||arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z')){
					System.out.println("�û�������");
					break;
				}else if(i==arr.length-1){
					System.out.println("�û�����ȷ");
					
				}
			}
		}else{
			System.out.println("��ʽ����");
		}
	}
}
