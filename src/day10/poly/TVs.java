package day10.poly;
/**
 * ������
 * */
public class TVs extends Goods{
	//���췽��
	public TVs(){
		
	}
	public TVs(String name,int price){
		this.setName(name);
		this.setPrice(price);
	}
	//��д�����ӡ����
	@Override
	public void print() {
		System.out.println(this.getName()+"�ļ۸��ǣ�"+this.getPrice());
	}
}
