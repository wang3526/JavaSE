package day12.string;
/**
 * ����ͳ�ƴ���С�����ֵĴ���
 * �󴮡�С���Լ�����
 * */
public class Demo01 {
	public static void main(String[] args) {
		//�����
		String max="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhiyaozhaodaogongzuojiushihaoma";
		//����С��
		String min="heima";
		//�������������
		int count=0;
		//��������
		int index=0;
		//����ѭ�����ж�С���Ƿ��ڴ��г���
		while((index=max.indexOf(min))!=-1){
			count++;     //����������
			max=max.substring(index+min.length());
		}
		System.out.println(count);
	}
}
