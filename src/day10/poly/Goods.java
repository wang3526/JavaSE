package day10.poly;
/**
 * ����˵��
	�Զ�����ͷ�����ʹ�ø�����Ϊ����ֵʵ�ִ�ӡ��ͬ������Ʒ�۸���
	���ࣺGoods����Ʒ�ࣩ
	���ࣺTVs�������ࣩ��Foods��ʳƷ�ࣩ
 * */
/**
 * ��Ʒ��
 * */
public abstract class Goods {
	private String name; //����
	private int price;   //�۸�

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//��ӡ�۸���󷽷�
	public abstract void print();
}
