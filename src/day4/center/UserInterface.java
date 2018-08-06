package day4.center;

/**
 * �����û��������ĵĹ���
 * */
public interface UserInterface {
	/**
	 * ע��
	 * @param name
	 * @param pwd
	 */
	public void register(String name,String pwd);
	/**
	 * �û���¼
	 * @param name
	 * @param pwd
	 * @return
	 */
	public boolean login(String name,String pwd);
	/**
	 * �޸�����
	 * @param name  �û���
	 * @param oldPwd ������
	 * @param newPwd ������
	 * @return
	 */
	public boolean rePassword(String name,String oldPwd,String newPwd);
	/**
	 * �޸��û���Ϣ
	 * @param uid 
	 * @param nickName
	 * @return
	 */
	public boolean editPersonInfo(String uid,String nickName);
	
}
