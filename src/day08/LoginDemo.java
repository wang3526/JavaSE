package day08;
/**
 * ��Ҫ�����ǵ��õ�¼����
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
	//����
	
	//��Ϊ  ʵ�ֵ�¼����
	//�ж��û��� �����Ƿ�Ϸ�
	private boolean isOk(String str){
		//length(); ��ȡ�ַ����ĳ���
		if(str.length()>=6 && str.length()<=16){
			return true;
		}
		return false;
	}
	
	public String login(String userName,String pwd){
		//1.�ж��û����Ƿ�Ϸ�6-16λ
		if(!isOk(userName)){
			return "�û������Ϸ���";	
		}
		//2.�ж������Ƿ�Ϸ�6-16λ
		if(!isOk(pwd)){
			return "������Ϸ������룡";
		}
		//3.�ж��Ƿ��¼�ɹ�
		if(userName.equals("mars123") && pwd.equals("123456")){
			return "��¼�ɹ�";
		}
		return "�û�����������󣬵�¼ʧ�ܣ�";
	}
}

