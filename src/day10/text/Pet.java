package day10.text;
/**
 * ����˵��
	������ˣ�������ҪΪ����ιʳ��ʹ�ö�̬ʵ�ָù���
	��ͬ����ԵĶ�����һ��
	��ͬ������궫����ָ�����ֵ��һ��
	����ֵ�ﵽ100ʱ������Ҫ����ιʳ
	��+3     ���+5
 * */
/**
 * ������
 * */
public abstract class Pet {
	private int health;    //����ֵ
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void eat();           //��
}
