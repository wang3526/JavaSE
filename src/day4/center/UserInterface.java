package day4.center;

/**
 * 定义用户个人中心的功能
 * */
public interface UserInterface {
	/**
	 * 注册
	 * @param name
	 * @param pwd
	 */
	public void register(String name,String pwd);
	/**
	 * 用户登录
	 * @param name
	 * @param pwd
	 * @return
	 */
	public boolean login(String name,String pwd);
	/**
	 * 修改密码
	 * @param name  用户名
	 * @param oldPwd 旧密码
	 * @param newPwd 新密码
	 * @return
	 */
	public boolean rePassword(String name,String oldPwd,String newPwd);
	/**
	 * 修改用户信息
	 * @param uid 
	 * @param nickName
	 * @return
	 */
	public boolean editPersonInfo(String uid,String nickName);
	
}
