package day15.test;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("ab");
		sb.append(true);
		sb.append("cd");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.delete(2, 6));
		System.out.println(sb.indexOf("bc"));
		System.out.println(sb.insert(2, "我来了"));
		System.out.println(sb.lastIndexOf("d"));
		System.out.println(sb.length());
		System.out.println(sb.replace(0, 2,"轻轻的"));
		System.out.println(sb.reverse());
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1, 3));
		
	}
}
