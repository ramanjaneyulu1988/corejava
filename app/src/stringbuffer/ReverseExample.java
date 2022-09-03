package stringbuffer;

public class ReverseExample {

	public static void main(String[] args) {
		
		String city = "Bangalore";
		
		// Convert from String to StringBuilder
		
		StringBuilder sb = new StringBuilder(city);
		System.out.println(sb);
		
		sb.reverse();
		// Convert from StringBuilder to String
		
		String s = sb.toString();
		System.out.println(s);
		
	}
}
