package day08;
/**
 * 主要作用是调用登录功能
 * @author Administrator
 *
 */
public class LoginDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Login lg =new Login();
		String string=lg.login("mars12", "123456");
		System.out.println(string);
	}

}

class Login{
	//属性
	
	//行为  实现登录功能
	//判断用户名 密码是否合法
	private boolean isOk(String str){
		//length(); 获取字符串的长度
		if(str.length()>=6 && str.length()<=16){
			return true;
		}
		return false;
	}
	
	public String login(String userName,String pwd){
		//1.判断用户名是否合法6-16位
		if(!isOk(userName)){
			return "用户名不合法！";	
		}
		//2.判断密码是否合法6-16位
		if(!isOk(pwd)){
			return "请输入合法的密码！";
		}
		//3.判断是否登录成功
		if(userName.equals("mars123") && pwd.equals("123456")){
			return "登录成功";
		}
		return "用户名或密码错误，登录失败！";
	}
}

