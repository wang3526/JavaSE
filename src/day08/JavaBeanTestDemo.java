package day08;

public class JavaBeanTestDemo {
	public static void main(String[] args) {
		//1����ʼ��һ��JavaBean����
		UserBean user=new UserBean();
		//2������һ��setter����
		user.setName("С��");
		user.setAge(18);
		user.setSex(true);
		//3��ȡ��ֵ
		System.out.println(user.getName()+" " + user.getAge()+" "+user.isSex());
	}
}
