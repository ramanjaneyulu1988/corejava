package exception;

import java.util.InputMismatchException;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		String s = null;
		try
		{
			int count = s.length();
			System.out.println(count);
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
