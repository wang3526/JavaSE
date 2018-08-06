package day08;

public class JavaBeanTestDemo {
	public static void main(String[] args) {
		//1、初始化一个JavaBean对象
		UserBean user=new UserBean();
		//2、调用一个setter方法
		user.setName("小乔");
		user.setAge(18);
		user.setSex(true);
		//3、取出值
		System.out.println(user.getName()+" " + user.getAge()+" "+user.isSex());
	}
}
