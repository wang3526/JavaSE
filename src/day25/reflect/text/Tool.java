package day25.reflect.text;

import java.lang.reflect.Field;

public class Tool {
	//* �˷����ɽ�obj��������ΪpropertyName�����Ե�ֵ����Ϊvalue��
	public void setProperty(Object obj, String propertyName, Object value) throws Exception{
		Class clazz=obj.getClass();  //��ȡ�ֽ������
		Field f=clazz.getDeclaredField(propertyName);//�������䣬��ȡ�ֶ�
		f.setAccessible(true); //ȥ��Ȩ��
		f.set(obj, value);
	}
	
}
