package day23.������;

public class Demo1_Adapter {
	/**
	 * ���������ģʽ
	 * ³����
	 * */
	public static void main(String[] args) {
		
	}
}

interface ����{
	public void ����();
	public void �();
	public void ײ��();
	public void ϰ��();
}

abstract class ����� implements ����{  //�����ɳ����ԭ���ǣ������������ഴ�����������Ϊ����Ҳû�����壬�������ǿյ�

	@Override
	public void ����() {
	}

	@Override
	public void �() {
	}

	@Override
	public void ײ��() {
	}

	@Override
	public void ϰ��() {
	}
	
}

class ³���� extends �����{
	@Override
	public void ϰ��() {
		System.out.println("���δ�����");
		System.out.println("ȭ�������");
		System.out.println("...........");
	}
}


