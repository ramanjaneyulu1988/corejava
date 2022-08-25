package oops.polymorphism;

class Parent
{
	public void test(int i)
	{
		System.out.println("Parent");
	}
}

public class MethodOverridingExample extends Parent
{
	public void test(int i)
	{
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		
		MethodOverridingExample c = new MethodOverridingExample();
		
		c.test(10);
	}
}
