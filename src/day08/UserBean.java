package day08;
/**
 * JavaBean 可重用的组件
 * 1、属性私有化
 * 2、公开其属性设置和获取方法
 * 3、必须有一个无参数的构造方法，如果有有参数的构造方法，需要写一个无参数构造方法
 * @author Administrator
 *
 */
public class UserBean {
	//字段
	private String name;  //姓名
	private int age;      //年龄
	private boolean sex;  //性别
	//公开setter/getter方法  set/get后跟的单词，必须是属性的单词，首字母大写
	//如果是boolean值类型，不能使用get，使用is
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//name=name;  //编译器不能识别，是栈区中的变量，还是堆区中的属性     
		this.name = name;   //this指当前对象，谁调用，this就代表谁
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
}
