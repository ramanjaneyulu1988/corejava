package string;

public class Example12 {

	public static void main(String[] args) {
		
		String s1 = "abc"; // Object creation with String literal way
		String s2 = new String("abc"); // Object creation using new keyword
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // false
	}
}
