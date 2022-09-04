package exception.userdefined;

import java.util.Scanner;

public class BankBalanceNotSufficientExceptionTest {

	public static void main(String[] args) {
		
		double balance = 5000.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		double withdraw = sc.nextDouble();
		
		if(balance >= withdraw)
		{
			System.out.println("Money withdraw successfully..");
		}
		else
		{
			throw new BankBalanceNotSufficientException("Bank balance in sufficient");
		}
	}
}
