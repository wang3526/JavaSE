package day21.otherio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo09_SystemIn {
	public static void main(String[] args) throws IOException {
		/*//InputStreamReader×ª»»Á÷
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		System.out.println(line);
		br.close();*/
		
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		System.out.println(line);
		sc.close();
		
	}
}
