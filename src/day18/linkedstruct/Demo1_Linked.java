package day18.linkedstruct;

//�ڵ���
class Node{
	//ָ���¸��ڵ������
	Node next;
	//���ݲ���
	String name;
	int age;
	//���췽��
	public Node() {
		super();
	}
	public Node(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}
public class Demo1_Linked {
	//����������ɾ���
	//����
	Node head=null;  //ͷ�ڵ�
	//��ӽڵ�
	public void addNode(Node node){
		//1���ж�ͷ����Ƿ�Ϊ��
		if(head==null){
			head=node;
			return;
		}
		//2���жϽ����¸��ڵ��Ƿ�Ϊ��
		Node tmpNode=head;
		Node preNode=null;
		while(tmpNode!=null){
			preNode=tmpNode;
			tmpNode=tmpNode.next;
			
		}
		//3�����Ϊnull�������µĽڵ㸳ֵ����ǰ�ڵ���¸��ڵ�
		preNode.next=node;
	}
	
	//�鿴���нڵ�
	public void list(){
		//�������нڵ�,��ͷ��ʼ
		//1����ͷ��㸳ֵ��tmp
		Node tmp=head;
		//2���жϽڵ��Ƿ�Ϊ��
		while(tmp!=null){
			System.out.println(tmp.toString());
			tmp=tmp.next;
		}
	}
	
	//ɾ���ڵ�
	public void delete(String name){
		//1����ͷ��㸳ֵ��tmp
		Node tmp=head;
		//�����ϸ��ڵ�
		Node pre=null;
		//2���жϵ�ǰ�ڵ��Ƿ�Ϊ��
		while(tmp!=null){
			//��ǰ�ڵ��Ƿ���Ҫɾ���Ľڵ�
			if(tmp.name.equals(name)){
				//ɾ���ڵ�
				//�ж�ɾ�����Ƿ��ǵ�һ���ڵ�
				if(tmp==head){
					head=head.next;
					break;
				}
				pre.next=tmp.next;
			}
			//����Ҫɾ���Ľڵ�
			pre=tmp;
			tmp=tmp.next;
		}
	}
	
	//ͨ�����ݲ�ѯ����
	public int selectIndex(String name){
		//�����±��ʼ����Ϊ0
		int index=0;
		//��ͷ��㸳ֵ��tmp
		Node tmp=head;
		//�жϵ�ǰ�ڵ��Ƿ�Ϊ��
		while(tmp!=null){
			//�жϵ�ǰ�ڵ��Ƿ�ΪҪ���ҵĽڵ�
			if(tmp.name.equals(name)){
				return index;
			}
			tmp=tmp.next;
			index++;
		}
		return -1;
	}
	
	//��ѯ ͨ�����ݲ�ѯ
	public String selectInfo(String name){
		//��ͷ��㸳ֵ��tmp
		Node tmp=head;
		//�жϵ�ǰ�ڵ��Ƿ�Ϊ��
		while(tmp!=null){
			//�жϵ�ǰ�ڵ��Ƿ�ΪҪ���ҵĽڵ�
			if(tmp.name.equals(name)){
				return tmp.toString();
			}
			tmp=tmp.next;
		}
		return "������"+name+"����Ϣ";
	}
	
	//��ָ��λ�ò���
	public void insert(int index,Node node){
		int count=-1;
		//��ͷ�ڵ㸳ֵ��tmp
		Node tmp=head;
		//����preָ��ǰһ���ڵ�
		Node pre=null;
		//�жϵ�ǰ�ڵ��Ƿ�Ϊ��,�����null,˵��������û�нڵ�,ֱ�����
		if(tmp==null){
			head=node;
		}
		while(tmp!=null){
			count++;
			//�Ƚϵ�ǰ�±��Ƿ���ָ���±���ͬ,�����ͬ,��ӽڵ�
			//�жϵ�ǰλ���Ƿ���ͷ��㣬
			if(index==0){
				head=node;
				node.next=tmp;
				break;
			//�жϵ�ǰλ���Ƿ��ǲ���λ��
			}else if(count==index){
				pre.next=node;//��ǰһ���ڵ��next�洢Ҫ����ڵ�����õ�ַ
				node.next=tmp;//��Ҫ����ڵ��next�洢���������ڵ�����õ�ַ
				break;
			}
			pre=tmp;//��ǵ�ǰ�ڵ�
			tmp=tmp.next;//����ǰ�ڵ�������һλ
			
		}
		//�������������count��С�ڲ����ָ��λ�ã�Ĭ�ϲ��뵽���
		if(count<index){
			pre.next=node;
		}
	}
	
	public static void main(String[] args) {
		Demo1_Linked demo=new Demo1_Linked();
		//��ӽڵ�
		demo.addNode(new Node("����", 23));
		demo.addNode(new Node("����", 24));
		demo.addNode(new Node("����", 25));
		demo.addNode(new Node("����", 26));
		//�鿴���нڵ�
		demo.list();
		System.out.println("-----------------");
		//ɾ��ָ���ڵ�
		demo.delete("����");
		demo.list();
		//����ָ���ڵ���±�
		int index=demo.selectIndex("����");
		System.out.println(index);
		//����ָ���ڵ����Ϣ
		String str=demo.selectInfo("����");
		System.out.println(str);
		System.out.println("--------------------");
		demo.insert(0, new Node("����", 27));
		demo.list();
	}
	
}
