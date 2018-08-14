package day21.io;

import java.io.File;

public class Demo01_File {
	public static void main(String[] args) {
		//1��ƴ���ַ���·��
		String path="C:\\Users\\Administrator\\Desktop\\gitee.txt";
		//2�����ַ���·����ת����File����
		File file=new File(path);
		//3����ȡ�ļ�������Ϣ
		//��ȡ�ļ�����
		System.out.println("�ļ�����"+file.getName());
		//��ȡ�ļ��ľ���·��
		System.out.println("����·����"+file.getAbsolutePath());
		//��ȡ�ļ������·��
		System.out.println("���·����"+file.getPath());
		//���ظ�Ŀ¼
		System.out.println("��Ŀ¼��"+file.getParent());
		//�����ļ�������С,���ص����ֽ�   kb  Mb  Gb
		System.out.println("������С��"+file.getTotalSpace());
		//�������ڷ��������ֽ���
		System.out.println("���������ֽڣ�"+file.getFreeSpace());
		//�ж��ļ��Ƿ��Ǿ���·��
		System.out.println("�Ƿ��Ǿ���·����"+file.isAbsolute());
		//�жϵ�ǰ�ļ��Ƿ���һ���ļ�
		System.out.println("�Ƿ����ļ���"+file.isFile());
		
	}
}
