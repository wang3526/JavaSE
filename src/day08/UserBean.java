package day08;
/**
 * JavaBean �����õ����
 * 1������˽�л�
 * 2���������������úͻ�ȡ����
 * 3��������һ���޲����Ĺ��췽����������в����Ĺ��췽������Ҫдһ���޲������췽��
 * @author Administrator
 *
 */
public class UserBean {
	//�ֶ�
	private String name;  //����
	private int age;      //����
	private boolean sex;  //�Ա�
	//����setter/getter����  set/get����ĵ��ʣ����������Եĵ��ʣ�����ĸ��д
	//�����booleanֵ���ͣ�����ʹ��get��ʹ��is
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//name=name;  //����������ʶ����ջ���еı��������Ƕ����е�����     
		this.name = name;   //thisָ��ǰ����˭���ã�this�ʹ���˭
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
}
