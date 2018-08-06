package day09.StudentDemo;
/**
 *需求说明
重写比较规则，判断两名学员（Student）是否为同一对象
Student相关属性：Id（学号）、name（姓名）、age（年龄）
如果两名学员的学号以及姓名相同，则为同一对象
instanceof用于判断一个引用类型所引用的对象是否是一个类的实例
 */
//继承Object类
public class Student{
	
	private int Id;           //学号
	private String name;      //姓名
	private int age;          //年龄
	
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
	
	//构造方法
	public Student() {}
	
	public Student(int Id,String name,int age){
		this.Id=Id;
		this.name=name;
		this.age=age;
	}
	//重写equals方法
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
