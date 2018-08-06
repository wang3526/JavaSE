package day12.arrays;

import java.util.Arrays;

/**
 * * A:Arrays类概述
	* 针对数组进行操作的工具类。
	* 提供了排序，查找等功能。
* B:成员方法
	* public static String toString(int[] a)
	* public static void sort(int[] a)
	* public static int binarySearch(int[] a,int key)
 * */
public class Demo01 {
	public static void main(String[] args) {
		int[] arr={11,22,33,66,44,55};   //数组转字符串
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);        //排序
		System.out.println(Arrays.toString(arr));
		
		int[] arr1={11,22,33,44,55,66};
		System.out.println(Arrays.binarySearch(arr1, 33));
		System.out.println(Arrays.binarySearch(arr1, 88));//负的插入点-1
		System.out.println(Arrays.binarySearch(arr1, 12));
	}
}
