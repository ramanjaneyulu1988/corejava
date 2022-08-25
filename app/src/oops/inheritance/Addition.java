package oops.inheritance;

public class Addition extends Calculator
{
	public static void main(String[] args) {
		
		Addition addition = new Addition();
		
		addition.add(40, 60);
		
		System.out.println("main");
	}
}
