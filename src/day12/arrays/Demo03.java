package day12.arrays;
/**
 * 需求：把数组中的数组按照指定格式拼接成一个字符串
 * 	例：
 * 	int[] arr={1,2,3};
 * 	输出结果:
 * 		"[1,2,3]"
 * 用StringBuffer的功能实现
 * */
public class Demo03 {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		System.out.println(arrayToString(arr));
	}
	/**
	 * 将数组转换成字符串
	 * 1、返回值类型String
	 * 2、参数列表int[]
	 *
	 *arrayToString 将数组转换为字符串
	 *array2String  2与To的发音一样就用2替换了To，后来演变成了一种书写习惯
	 *dom4J   domForJ
	 */
	public static String arrayToString(int[] arr){
		StringBuffer sb=new StringBuffer();//创建字符串缓冲区
		sb.append("[");//将[添加到字符串
		for(int i=0;i<arr.length;i++){//遍历数组
			//sb.append(arr[i]+",");  //这样没有]
			if(i==arr.length-1){
				sb.append(arr[i]).append("]");
			}else{
				sb.append(arr[i]).append(",");
			}	
		}
		return sb.toString();
	}
}
