package day10.poly;
/**
 * ʳƷ��
 * */
public class Foods extends Goods{
	//���췽��
	public Foods() {
	}
	public Foods(String name,int price){
		this.setName(name);
		this.setPrice(price);
	}
	//��д�����ӡ����
	@Override
	public void print() {
		System.out.println(this.getName()+"�ļ۸��ǣ�"+this.getPrice());
	}
	
}
