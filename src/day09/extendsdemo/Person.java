package day09.extendsdemo;
/**
 * ����
 * ������๫�������Ժ���Ϊ
 */
public class Person {
	//��������
	String name;   //����
	int age;       //����
	
	public Person(){
		System.out.println("����Ĭ�Ϲ���");
	}
	public Person(int age){
		System.out.println("������ι���");
	}
	//����
	public void sleep(){
		System.out.println(name+"˯��");
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		student.sn="123245";
		student.name="С��";
		student.age=18;
		student.sleep();
		System.out.println(student.sn);
	}
	
}

/**
 * ����̳и���
 * ���Լ̳и��๫��������  ���Ժͷ���  �����˽�еĲ��ܱ��̳�
 * �̳���Ҫһ���ؼ���extends
 * Java��ֻ֧�ֵ����̳У�ֻ��һ���������ף�
 * 
 * �������ӵ���Լ����е�����
 * */
class Student extends Person{
	//��������
	String sn;     //ѧ��
	
	public Student(){
		super(18);
		System.out.println("����Ĭ�Ϲ���");
	}
	
	public Student(int sn){
		System.out.println("������ι���");
	}
	
}

class Teacher extends Person{
	//��������
	String level;   //����
}

class Employee extends Person{
	//��������
	String date;    //��ְʱ��
}















