package day10.poly;
/**
 * �����
 * */
public class Guest {
	//����Ʒ
	public static Goods buy(int type){
		if(type==1){
			TVs tVs=new TVs("����", 2300);
			return tVs;
		}
		Foods foods=new Foods("��ֻ��������",13);
		return foods;
		
	}
	
	public static void main(String[] args) {
		buy(1).print();
		buy(2).print();
	}
}
