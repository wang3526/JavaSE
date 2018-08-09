package day18.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test1 {
	/**
	 * * ����������, ���ԴӼ���������ն������, ֱ������quitʱ��������.
	 *  ����������������������д�ӡ.
	 *  
	 *  ������
	 *  1������Scanner�������¼��
	 *  2������TreeSet���϶���TreeSet�����д���Ƚ���
	 *  3������ѭ�����Ͻ�������������quit��������Ϊ�Ƴ�ʱquit�����Լ���¼�붼���ַ�����ʽ
	 *  4���ж���quit���˳�������ת����Integer������ӵ�������
	 *  5������TreeSet���ϲ���ӡÿһ��Ԫ��
	 * */
	public static void main(String[] args) {
		//1������Scanner�������¼��
		Scanner sc=new Scanner(System.in);
		//2������TreeSet���϶���TreeSet�����д���Ƚ���
		TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				int num=i2-i1;  //�Զ�����
				return num==0?1:num;
			}
		});
		//3������ѭ�����Ͻ�������������quit��������Ϊ�Ƴ�ʱquit�����Լ���¼�붼���ַ�����ʽ
		while(true){
			System.out.println("�����룺");
			String line=sc.nextLine(); //������¼����ַ����洢��line
			if("quit".equals(line)){
				break;
			}
			//4���ж���quit���˳�������ת����Integer������ӵ�������
			Integer i=Integer.parseInt(line);
			ts.add(i);
		}
		// 5������TreeSet���ϲ���ӡÿһ��Ԫ��
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}
}
