package oops.abstraction;

abstract class A
{
	public String name = "abc";
	
	abstract public void test();
	
	public void test1()
	{
		System.out.println("test1");
	}
	
	public A()
	{
		
	}
}

public class Example1 extends A
{	
	public static void main(String[] args) {
		
		A a = new Example1(); // Auto upcasting
		
		a.test1();
		a.test();
	}
	
	public void test()
	{
		System.out.println("test");
	}
}
