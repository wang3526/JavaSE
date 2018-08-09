package day18.linkedstruct;

//节点类
class Node{
	//指向下个节点的引用
	Node next;
	//数据部分
	String name;
	int age;
	//构造方法
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
	//操作链表，增删查改
	//属性
	Node head=null;  //头节点
	//添加节点
	public void addNode(Node node){
		//1、判断头结点是否为空
		if(head==null){
			head=node;
			return;
		}
		//2、判断结点的下个节点是否为空
		Node tmpNode=head;
		Node preNode=null;
		while(tmpNode!=null){
			preNode=tmpNode;
			tmpNode=tmpNode.next;
			
		}
		//3、如果为null，把最新的节点赋值给当前节点的下个节点
		preNode.next=node;
	}
	
	//查看所有节点
	public void list(){
		//遍历所有节点,从头开始
		//1、将头结点赋值给tmp
		Node tmp=head;
		//2、判断节点是否为空
		while(tmp!=null){
			System.out.println(tmp.toString());
			tmp=tmp.next;
		}
	}
	
	//删除节点
	public void delete(String name){
		//1、将头结点赋值给tmp
		Node tmp=head;
		//声明上个节点
		Node pre=null;
		//2、判断当前节点是否为空
		while(tmp!=null){
			//当前节点是否是要删除的节点
			if(tmp.name.equals(name)){
				//删除节点
				//判断删除的是否是第一个节点
				if(tmp==head){
					head=head.next;
					break;
				}
				pre.next=tmp.next;
			}
			//不是要删除的节点
			pre=tmp;
			tmp=tmp.next;
		}
	}
	
	//通过内容查询索引
	public int selectIndex(String name){
		//定义下标初始索引为0
		int index=0;
		//将头结点赋值给tmp
		Node tmp=head;
		//判断当前节点是否为空
		while(tmp!=null){
			//判断当前节点是否为要查找的节点
			if(tmp.name.equals(name)){
				return index;
			}
			tmp=tmp.next;
			index++;
		}
		return -1;
	}
	
	//查询 通过内容查询
	public String selectInfo(String name){
		//将头结点赋值给tmp
		Node tmp=head;
		//判断当前节点是否为空
		while(tmp!=null){
			//判断当前节点是否为要查找的节点
			if(tmp.name.equals(name)){
				return tmp.toString();
			}
			tmp=tmp.next;
		}
		return "不存在"+name+"的信息";
	}
	
	//在指定位置插入
	public void insert(int index,Node node){
		int count=-1;
		//将头节点赋值给tmp
		Node tmp=head;
		//定义pre指向前一个节点
		Node pre=null;
		//判断当前节点是否为空,如果是null,说明该链表没有节点,直接添加
		if(tmp==null){
			head=node;
		}
		while(tmp!=null){
			count++;
			//比较当前下标是否与指定下标相同,如果相同,添加节点
			//判断当前位置是否是头结点，
			if(index==0){
				head=node;
				node.next=tmp;
				break;
			//判断当前位置是否是插入位置
			}else if(count==index){
				pre.next=node;//将前一个节点的next存储要插入节点的引用地址
				node.next=tmp;//将要插入节点的next存储插入索引节点的引用地址
				break;
			}
			pre=tmp;//标记当前节点
			tmp=tmp.next;//将当前节点往下移一位
			
		}
		//如果链表遍历完后count还小于插入的指定位置，默认插入到最后
		if(count<index){
			pre.next=node;
		}
	}
	
	public static void main(String[] args) {
		Demo1_Linked demo=new Demo1_Linked();
		//添加节点
		demo.addNode(new Node("张三", 23));
		demo.addNode(new Node("李四", 24));
		demo.addNode(new Node("王五", 25));
		demo.addNode(new Node("赵六", 26));
		//查看所有节点
		demo.list();
		System.out.println("-----------------");
		//删除指定节点
		demo.delete("张三");
		demo.list();
		//查找指定节点的下标
		int index=demo.selectIndex("周七");
		System.out.println(index);
		//查找指定节点的信息
		String str=demo.selectInfo("李四");
		System.out.println(str);
		System.out.println("--------------------");
		demo.insert(0, new Node("周七", 27));
		demo.list();
	}
	
}
