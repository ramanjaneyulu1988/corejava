package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("Enter age");
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int age = sc.nextInt();
			
			System.out.println("Entered age is : "+age);
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("main method end");
		System.out.println("main method end");
		System.out.println("main method end");
		System.out.println("main method end");
		System.out.println("main method end");
	}
	
}
