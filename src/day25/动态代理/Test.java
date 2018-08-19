package day25.¶¯Ì¬´úÀí;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		UserImp ui=new UserImp();
		ui.add();
		ui.delete();
		
		/**
		 * * public static Object newProxyInstance(ClassLoader loader,
		 		* Class<?>[] interfaces,InvocationHandler h)
		 * */
		System.out.println("-------------------");
		MyInvocationHandler m=new MyInvocationHandler(ui);
		User u=(User)Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(),m);
		u.add();
		u.delete();
	}
}
