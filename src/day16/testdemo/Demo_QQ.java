package day16.testdemo;

public class Demo_QQ {
	/**
	 * QQ����֤
	 * 
	 * ������
	 * 1������
	 * 2����һλ������0
	 * 3��������5-11λ��
	 * */
	public static void main(String[] args) {
		String str="04145769";
		if(str.length()>=5&&str.length()<=11){
			char[] arr=str.toCharArray();
			for (int i = 1; i < arr.length; i++) {
				if(!(arr[0]==0&&arr[i]>='0'&&arr[i]<='9')){
					System.out.println("QQ�Ŵ���");
					break;
				}else if(i==arr.length-1){
					System.out.println("QQ������ȷ");
				}
			}
		}else {
			System.out.println("QQ�������");
		}
	}
}
