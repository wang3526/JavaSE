package day12.arrays;

import java.util.Arrays;

/**
 * * A:Arrays�����
	* ���������в����Ĺ����ࡣ
	* �ṩ�����򣬲��ҵȹ��ܡ�
* B:��Ա����
	* public static String toString(int[] a)
	* public static void sort(int[] a)
	* public static int binarySearch(int[] a,int key)
 * */
public class Demo01 {
	public static void main(String[] args) {
		int[] arr={11,22,33,66,44,55};   //����ת�ַ���
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);        //����
		System.out.println(Arrays.toString(arr));
		
		int[] arr1={11,22,33,44,55,66};
		System.out.println(Arrays.binarySearch(arr1, 33));
		System.out.println(Arrays.binarySearch(arr1, 88));//���Ĳ����-1
		System.out.println(Arrays.binarySearch(arr1, 12));
	}
}
