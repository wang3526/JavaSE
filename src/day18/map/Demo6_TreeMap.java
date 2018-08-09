package day18.map;

import java.util.Comparator;
import java.util.TreeMap;

import day18.bean.Student;

public class Demo6_TreeMap {
	/**
	 * * A:案例演示
			* TreeMap集合键是Student值是String的案例
	 * */
	public static void main(String[] args) {
		//demo1();
		TreeMap<Student, String> tm=new TreeMap<Student, String>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int num=o1.getName().compareTo(o2.getName());//按照姓名比较
				return num==0?o1.getAge()-o2.getAge():num;
			}
		});
		tm.put(new Student("张三", 23), "北京");
		tm.put(new Student("李四", 24), "上海");
		tm.put(new Student("王五", 25), "广州");
		tm.put(new Student("赵六", 26), "深圳");
		
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student, String> tm=new TreeMap<Student, String>();
		tm.put(new Student("张三", 23), "北京");
		tm.put(new Student("李四", 24), "上海");
		tm.put(new Student("王五", 25), "广州");
		tm.put(new Student("赵六", 26), "深圳");
		
		System.out.println(tm);
	}
}
