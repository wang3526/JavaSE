package day18.linkedstruct;

class Nodes{
	//ָ����һ�ڵ������
	Nodes next;
	//ָ��ǰһ�ڵ������
	Nodes preo;
	
	private String name;
	private int age;
	public Nodes() {
		super();
	}
	public Nodes(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "������"+name+"�����䣺"+age;
	}
	
}
public class Demo2_DoubleLinked {
	//����ͷ���
	Nodes head=null;
	//����β�ڵ�
	Nodes foot=null;
	
	//��β����ӽڵ�
	public void addLastNodes(Nodes node){
		//�ж�ͷ����Ƿ�Ϊ��
		if(foot==null){
			head=node;
			foot=node;
			return;
		}
		foot.next=node; 
		node.preo=foot;
		foot=node;
	}
	
	//��ͷ����ӽڵ�
	public void addFirstNodes(Nodes node){
		if(head==null){
			head=node;
			foot=node;
			return;
		}
		node.next=head;
		head.preo=node;
		head=node;
	}
	//�鿴���нڵ�
	public void list(){
		//��ͷ��㸳ֵ��tmp
		Nodes tmp=head;
		//�жϽڵ��Ƿ�Ϊ��
		while(tmp!=null){
			System.out.println(tmp.toString());
			tmp=tmp.next;
		}
	}
	
	public static void main(String[] args) {
		Demo2_DoubleLinked demo=new Demo2_DoubleLinked();
		demo.addLastNodes(new Nodes("����", 23));
		demo.addLastNodes(new Nodes("����", 24));
		demo.addLastNodes(new Nodes("����", 25));
		demo.addLastNodes(new Nodes("����", 26));
		demo.list();
		System.out.println("---------------------");
		demo.addFirstNodes(new Nodes("����", 27));
		demo.list();
	}	
}
