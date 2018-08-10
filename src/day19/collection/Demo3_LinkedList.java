package day19.collection;

import java.util.LinkedList;

public class Demo3_LinkedList {
	/**
	 * LinkedList
	 * �ص� Deque��List�ӿڵ�����
	 * 1��Ԫ������
	 * 2��Ԫ�ؿ�����null
	 * 3��Ԫ�ؿ����ظ�
	 * 4���ײ�������˫������
	 * 5�����ж��е��ص��ջ���ص�
	 * 6����֧��ͬ��
	 * */
	public static void main(String[] args) {
		//��ʼ��LinkedList����     ���б�
		LinkedList<String> list=new LinkedList<String>();
		//��������
		list.add("С��");
		list.add(0, "����");   //�������ָ��λ�����
		list.addFirst("���"); //�������ͷ�����
		list.addLast("���");  //�������β�����
		list.push("������");   //ѹջ,ͷ��ջ��
		//list.pop();           //��ջ
		System.out.println(list);
		
		//�޸�����
		list.set(2, "����");  
		
		//��ѯ
		System.out.println(list.get(2));//ȡ��ָ��λ�õ�Ԫ��
		System.out.println(list.getFirst());//ȡ����һ��Ԫ��
		System.out.println(list.getLast());//ȡ�����һ��Ԫ��
		System.out.println(list.element());//ȡ����һ��Ԫ��
		
		System.out.println(list.offer("�ŷ�"));//��β�����Ԫ��
		System.out.println(list.offerFirst("����"));//��ͷ�����Ԫ��
		System.out.println(list.offerLast("����"));//��β�����Ԫ��
		
		System.out.println(list.indexOf("�ŷ�"));//Ԫ���״γ��ֵ�����
		System.out.println(list);
		//ɾ������
		/*System.out.println(list.poll());//ȡ��headԪ�أ���ɾ����Ԫ��
		System.out.println(list.pollFirst());//ȡ����һ��Ԫ�أ���ɾ��
		System.out.println(list.pollLast());//ȡ�����һ��Ԫ�أ���ɾ��
*/		list.remove();//ɾ��ͷ
		list.remove(2);//ɾ��ָ��λ�õ�Ԫ��
		list.remove("С��");//ɾ���״γ��ֵ�ָ��Ԫ��
		
		//����ɾ�� ����ʹ�õ�����
		
		
		
		System.out.println(list);
	}
}
