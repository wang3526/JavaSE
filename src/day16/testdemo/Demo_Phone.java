package day16.testdemo;

public class Demo_Phone {
	/**
	 * �ֻ�������֤
	 * 
	 * ����
	 * 1��11λ
	 * 2����һλ��1���ڶ�λ��3��5��8������9λ��0-9��������
	 * */
	public static void main(String[] args) {
		String str="18937576793";
		if(str.length()==11){
			char[] arr=str.toCharArray();//ת�����ַ�����
			for (int i = 2; i < arr.length; i++) {
				if(!(arr[0]=='1'&&(arr[1]=='3'||arr[1]=='5'||arr[1]=='8')&&(arr[i]>='0'&&arr[i]<='9'))){
					System.out.println("�ֻ��Ŵ���");
					break;
				}else if(i==arr.length-1){
					System.out.println("�ֻ�����ȷ");
				}
			}
		}else{
			System.out.println("�ֻ��Ŵ���");
		}
	}
}
