package string;

public class Example5 {

	public static void main(String[] args) {
		
		String s = "abc";
		String s1 = "ABC";
		
		boolean b = s.equals(s1);
		System.out.println(b); // false
		
		boolean b1 = s.equalsIgnoreCase(s1);
		System.out.println(b1); // true
		
	}
}
