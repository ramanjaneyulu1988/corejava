package exception.userdefined;

import java.util.Scanner;

public class AgeNotSufficientExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age >= 70)
		{
			throw new AgeNotSufficientException("For this age this policy is not applicable");
		}
		else
		{
			System.out.println("Proceed...");
		}
		
	}
}
