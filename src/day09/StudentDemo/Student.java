package day09.StudentDemo;
/**
 *����˵��
��д�ȽϹ����ж�����ѧԱ��Student���Ƿ�Ϊͬһ����
Student������ԣ�Id��ѧ�ţ���name����������age�����䣩
�������ѧԱ��ѧ���Լ�������ͬ����Ϊͬһ����
instanceof�����ж�һ���������������õĶ����Ƿ���һ�����ʵ��
 */
//�̳�Object��
public class Student{
	
	private int Id;           //ѧ��
	private String name;      //����
	private int age;          //����
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
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
	
	//���췽��
	public Student() {}
	
	public Student(int Id,String name,int age){
		this.Id=Id;
		this.name=name;
		this.age=age;
	}
	//��дequals����
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)){
			return true;
		}
		if(obj instanceof Student){
			Student stu=(Student)obj;
			if(this.getId()==stu.getId()&&this.getName()==stu.getName()){
				return true;
			}
		}
		return false;
	}
	
}
