package day20.chario;

public class Demo6_Wrap {
	/**
	 * װ�����ģʽ�ĺô��ǣ�
	 * ����Բ�ǿ����װ�ε���ı仯��װ����ı仯�޹�
	 * */
	public static void main(String[] args) {
		HeimaStudent hs=new HeimaStudent(new Student());
		hs.code();
	}
}

interface Coder{
	public void code();
}

class Student implements Coder{
	@Override
	public void code() {
		System.out.println("JavaSE");
		System.out.println("JavaWeb");
	}
}

class HeimaStudent implements Coder{
	//1����ȡ��װ���������
	private Student s;   //��ȡѧ������
	
	//2���ڹ��췽���д��뱻װ�εĶ���
	public HeimaStudent(Student s) {
		super();
		this.s = s;
	}
	
	//3����ԭ�еĹ��ܽ�������
	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("���ݿ�");
		System.out.println("������");
		System.out.println("......");
	}
}