package day21.test;

import java.util.ArrayList;

public class Test08 {
	/**
	 * Լɪ��
	 * * ��������
	 * */
	public static void main(String[] args) {
		System.out.println(getLucklyNum(8));
	}
	
	/**
	 * ��ȡ��������
	 * 1������ֵ����int
	 * 2�������б�int num
	 * */
	public static int getLucklyNum(int num){
		ArrayList<Integer> list=new ArrayList<Integer>();//�������ϴ洢1-num�Ķ���
		for(int i=1;i<=num;i++){
			list.add(i);//��1-num�洢�ڼ�����
		}
		
		int count=1;//���������ģ�ֻ����3�ı�����ɾ��
		for(int i=0;list.size()!=1;i++){//ֻҪ��������������1���Ͳ���ɱ
			if(i==list.size()){//���i��������������������1ʱ�����¹�0
				i=0;
			}
			if(count%3==0){//�����3�ı�������ɱ��
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}
}
