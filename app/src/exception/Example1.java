package exception;

import java.util.InputMismatchException;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("main method start");
		
		try
		{
			String s = null;
			char c = s.charAt(3);
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("main method end");
	}
}
