package day4.center.implement;

import day4.center.UserInterface;

public class UserImplement implements UserInterface{
	//�����û����ܵ�ʵ�֣��������ݿ�
	@Override
	public void register(String name, String pwd) {
		// ע���ѯ���ݿ�Ĵ���
	}

	@Override
	public boolean login(String name, String pwd) {
		// ��¼���ݿ�Ĵ���
		return false;
	}

	@Override
	public boolean rePassword(String name, String oldPwd, String newPwd) {
		//�޸�����
		return false;
	}

	@Override
	public boolean editPersonInfo(String uid, String nickName) {
		// �༭��������
		return false;
	}
	
}
