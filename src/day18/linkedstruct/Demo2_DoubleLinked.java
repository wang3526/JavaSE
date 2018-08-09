package day18.linkedstruct;

class Nodes{
	//指向下一节点的引用
	Nodes next;
	//指向前一节点的引用
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
		return "姓名："+name+"，年龄："+age;
	}
	
}
public class Demo2_DoubleLinked {
	//定义头结点
	Nodes head=null;
	//定义尾节点
	Nodes foot=null;
	
	//在尾部添加节点
	public void addLastNodes(Nodes node){
		//判断头结点是否为空
		if(foot==null){
			head=node;
			foot=node;
			return;
		}
		foot.next=node; 
		node.preo=foot;
		foot=node;
	}
	
	//在头部添加节点
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
	//查看所有节点
	public void list(){
		//将头结点赋值给tmp
		Nodes tmp=head;
		//判断节点是否为空
		while(tmp!=null){
			System.out.println(tmp.toString());
			tmp=tmp.next;
		}
	}
	
	public static void main(String[] args) {
		Demo2_DoubleLinked demo=new Demo2_DoubleLinked();
		demo.addLastNodes(new Nodes("张三", 23));
		demo.addLastNodes(new Nodes("李四", 24));
		demo.addLastNodes(new Nodes("王五", 25));
		demo.addLastNodes(new Nodes("赵六", 26));
		demo.list();
		System.out.println("---------------------");
		demo.addFirstNodes(new Nodes("周七", 27));
		demo.list();
	}	
}
