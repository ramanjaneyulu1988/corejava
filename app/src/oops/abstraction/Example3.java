package oops.abstraction;

abstract class C1
{
	public abstract void test1();
	
	public void test4()
	{
		
	}
}

abstract class C2 extends C1
{
	public abstract void test2();
}

abstract class C3 extends C2
{
	public abstract void test3();
}

public class Example3 extends C1
{
	public void test1()
	{
		
	}
}
