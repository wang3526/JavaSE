package day18.map;

import java.util.LinkedHashMap;

public class Demo5_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		lhm.put("����", 23);
		lhm.put("����", 24);
		lhm.put("����", 26);
		lhm.put("����", 25);
		
		
		System.out.println(lhm);
	}
}
