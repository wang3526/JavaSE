package day17.datastruct;

public class Demo1_Array {
	/**
	 * 模拟数据存储的案例,模拟上场球员的球衣号码的存储:
        Integer[] players = null;
		作为一个教练,要安排上场:
           1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码.
           2):安排5个球员上场:[11,22,33,44,55].
           3):查询指定位置的球员的球衣号码是多少.查询索引位置为2的球衣号码是:33.
           4):根据球衣号码查询该球员在场上的索引位置. 44球衣号的球员在场上的索引位置是:3.
           5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333. 333把33替换了.
           6):替换球衣号码为22的球员,替换之后为222.
           7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位.).
           8):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55].
	 * */
	public static void main(String[] args) {
		//定义一个Integer类数组
		//1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码.
		Integer[] players=new Integer[5];
		//2):安排5个球员上场:[11,22,33,44,55].
		players[0]=11;
		players[1]=22;
		players[2]=33;
		players[3]=44;
		players[4]=55;
		//3):查询指定位置的球员的球衣号码是多少.查询索引位置为2的球衣号码是:33.
		int num=players[2];
		System.out.println(num);
		//4):根据球衣号码查询该球员在场上的索引位置. 44球衣号的球员在场上的索引位置是:3.
		for (int i = 0; i < players.length; i++) {
			if(players[i]==44){
				System.out.println("44球衣号的球员索引位置是："+i);
			}
		}
		//5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333. 333把33替换了.
		players[2]=333;
		//6):替换球衣号码为22的球员,替换之后为222.
		for (int i = 0; i < players.length; i++) {
			if(players[i]==22){
				players[i]=222;
			}
		}
		//7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位.).
		players[2]=null;
		//8):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55].
		System.out.print("[");
		for (int i = 0; i < players.length; i++) {
			if(i==players.length-1){
				System.out.println(players[i]+"]");
			}else {
				System.out.print(players[i]+",");
			}
		}
		
	}
}
