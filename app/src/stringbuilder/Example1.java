package stringbuilder;

public class Example1 {

public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("xyz");
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}
