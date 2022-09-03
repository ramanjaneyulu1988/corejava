package exception;

public class IndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		String s = "Bangalore";
		
		try
		{
			char c = s.charAt(60);
			System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("main mehtod end....");
	}
}
