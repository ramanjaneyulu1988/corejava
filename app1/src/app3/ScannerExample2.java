package app3;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter second name");
		String secondName = sc.nextLine();
		
		String fullname = firstName+" "+secondName;
		System.out.println(fullname);
		
	}
}
