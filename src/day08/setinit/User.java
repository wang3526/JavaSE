package day08.setinit;

public class User {
	// ����
	private String name; // ����
	private int age; // ����
	// ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//Ĭ�Ϲ��췽��
	public User(){
		
	}
	
	public User(String name,int age){
		//this.name=name;
		//this.age=age;
		setName(name);
		setAge(age);
	}
	
	public static void main(String[] args) {
		//��ʼ��һ������ͬʱ���������Ը�ֵ   �����ַ�ʽ
		//1��ͨ��setterע��
			//1.1��ʼ������
			User user=new User();
			//1.2�������������и�ֵ
			user.setName("С��");
			user.setAge(18);
			System.out.println(user.getName()+" "+user.getAge());
			
		//2��ͨ�����췽����ֵ
			User user1=new User("����",20);
			System.out.println(user1.getName()+" "+user1.getAge());
		/**�ܽ᣺����ʼ�������ʱ�򣬶�������ԱȽ��ٵ�����£�ͨ�����췽������������Խ��и�ֵ
			����ʼ�������ʱ�򣬶�������ԱȽ϶������£�ͨ��setter��������������Խ��и�ֵ*/
	}
	
}
