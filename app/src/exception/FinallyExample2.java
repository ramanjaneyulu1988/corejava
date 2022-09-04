package exception;

public class FinallyExample2 {

	public static void main(String[] args) {
		
		System.out.println("main method start");
		String s = null;
		
		try
		{
			System.out.println("try block start");
			boolean b = s.equals("abc"); // NullPointerException
			System.out.println(b);
			
			System.out.println("try block end");
		}
		catch (ArithmeticException e) {
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
		
		System.out.println("main method end");
	}
}
