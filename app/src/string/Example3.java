package string;

public class Example3 {

	public static void main(String[] args) {
		
		String str = "BangaloreHyderabad";
		
		String s = str.substring(0, 4);
		System.out.println(s);
		
		String s1 = str.substring(4, 8);
		System.out.println(s1);
		
		String s2 = str.substring(8); // eHyderabad
		System.out.println(s2);
	}
}
