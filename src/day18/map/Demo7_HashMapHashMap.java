package day18.map;

import java.util.HashMap;

import day18.bean.Student;

public class Demo7_HashMapHashMap {
	/**
	 * * A:案例演示
			* 集合嵌套之HashMap嵌套HashMap
		需求：
		双元课堂有很多基础班
		第88期基础班定义成一个双列集合，键是学生对象，值是学生归属地。
		第99期基础班定义成一个双列集合，键是学生对象，值是学生归属地。
		
		无论88期还是99期都是班级对象，所以为了方便统一管理，把这些班级对象添加到双元课堂集合中
	 * */
	public static void main(String[] args) {
		//定义88期基础班
		HashMap<Student, String> hm88=new HashMap<Student, String>();
		hm88.put(new Student("张三", 23), "北京");
		hm88.put(new Student("李四", 24), "北京");
		hm88.put(new Student("王五", 25), "上海");
		hm88.put(new Student("赵六", 26), "广州");
		
		//定义99期基础班
		HashMap<Student, String> hm99=new HashMap<Student, String>();
		hm99.put(new Student("大乔", 20), "北京");
		hm99.put(new Student("小乔", 19), "北京");
		hm99.put(new Student("周瑜", 22), "上海");
		hm99.put(new Student("孙策", 24), "广州");
		
		//定义双元课堂
		HashMap<HashMap<Student, String>, String> hm=new HashMap<HashMap<Student,String>, String>();
		hm.put(hm88, "第88期基础班");
		hm.put(hm99, "第99期基础班");
		
		//双列集合遍历
		for(HashMap<Student, String> h:hm.keySet()){//hm.keySet()代表双列集合中键的集合
			String value=hm.get(h);//get(h)根据键值获取值对象
			//遍历键的双列集合对象
			for(Student key:h.keySet()){//h.keySet()获取集合中所有学生键对象
				String value2=h.get(key);
				System.out.println(key+"="+value2+"="+value);
			}
		}
	}
}
