package day10.text;
/**
 * �����
 * */
public class Penguin extends Pet{
	//���췽��
	public Penguin() {
	}
	public Penguin(int health){
		this.setHealth(health);
	}
	//��д���෽��
	@Override
	public void eat() {
		if(this.getHealth()<100){
			this.setHealth(this.getHealth()+5);
			System.out.println("�����㣬����ֵ+5");
		}
		if(this.getHealth()>=100){
			this.setHealth(100);
			System.out.println("����Ѿ��Ա���");
			System.out.println("��ǰ����ֵΪ��"+this.getHealth());
		}
	}
}
