package day12.arrays;
/**
 * ���󣺰������е����鰴��ָ����ʽƴ�ӳ�һ���ַ���
 * 	����
 * 	int[] arr={1,2,3};
 * 	������:
 * 		"[1,2,3]"
 * ��StringBuffer�Ĺ���ʵ��
 * */
public class Demo03 {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		System.out.println(arrayToString(arr));
	}
	/**
	 * ������ת�����ַ���
	 * 1������ֵ����String
	 * 2�������б�int[]
	 *
	 *arrayToString ������ת��Ϊ�ַ���
	 *array2String  2��To�ķ���һ������2�滻��To�������ݱ����һ����дϰ��
	 *dom4J   domForJ
	 */
	public static String arrayToString(int[] arr){
		StringBuffer sb=new StringBuffer();//�����ַ���������
		sb.append("[");//��[��ӵ��ַ���
		for(int i=0;i<arr.length;i++){//��������
			//sb.append(arr[i]+",");  //����û��]
			if(i==arr.length-1){
				sb.append(arr[i]).append("]");
			}else{
				sb.append(arr[i]).append(",");
			}	
		}
		return sb.toString();
	}
}
