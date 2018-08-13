package day21.test;

import java.util.ArrayList;

public class Test08 {
	/**
	 * 约瑟夫环
	 * * 幸运数字
	 * */
	public static void main(String[] args) {
		System.out.println(getLucklyNum(8));
	}
	
	/**
	 * 获取幸运数字
	 * 1、返回值类型int
	 * 2、参数列表int num
	 * */
	public static int getLucklyNum(int num){
		ArrayList<Integer> list=new ArrayList<Integer>();//创建集合存储1-num的对象
		for(int i=1;i<=num;i++){
			list.add(i);//将1-num存储在集合中
		}
		
		int count=1;//用来数数的，只有是3的倍数就删除
		for(int i=0;list.size()!=1;i++){//只要集合中人数超过1，就不断杀
			if(i==list.size()){//如果i增长到集合最大的索引加1时，重新归0
				i=0;
			}
			if(count%3==0){//如果是3的倍数，就杀人
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}
}
