package day10.text;
/**
 * ����
 * */
public class Dog extends Pet{
	//���췽��
	public Dog(){
		
	}
	public Dog(int health){
		this.setHealth(health);
	}
	//��д���෽��
	@Override
	public void eat() {
		if(this.getHealth()<100){
			this.setHealth(this.getHealth()+3);
			System.out.println("���˹���������ֵ+3");	
		}
		if(this.getHealth()>=100){
			this.setHealth(100);
			System.out.println("�����Ѿ��Ա���");
			System.out.println("��ǰ����ֵΪ��"+this.getHealth());
		
		}
	}
}
