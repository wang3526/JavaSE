package day12.string;

import java.util.Scanner;

public class Test1 {
	/**
	 * ģ���¼
	 * ���󣺸����λ��ᣬ����ʾ���м���
	 * �û��������붼��admin
	 * ������
	 * 1��ģ���¼����Ҫ����¼�룬Scanner
	 * 2�������λ��ᣬ��Ҫѭ����for
	 * 3������ʾ���м��Σ���Ҫ�жϣ�if
	 * */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("�������û�����");
			String userName=scanner.nextLine();
			System.out.println("���������룺");
			String pwd=scanner.nextLine();
			//������ַ����������ַ��������Ƚϣ�ͨ�������ַ�����������
			//�����������������������ݣ���ֹ��ָ���쳣
			if("admin".equals(pwd)&&"admin".equals(userName)){
				System.out.println("��ӭ"+userName+"��¼");
				break;
			}else{
				if(i==3){
					System.out.println("���¼������Ե�������������");	
				}else{
					System.out.println("�û�����������󣡻���"+(3-i)+"�λ��ᣡ");
				}
			}		
		}
	}
}
