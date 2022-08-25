package oops.abstraction;

interface E
{
	String name = "abc";
	
	public abstract void test1();
	public void test2();
	abstract void test3();
	int test4();
	
	public static void test5()
	{
		
	}
	
	default void test6()
	{
		
	}
}

public class Example5 implements E
{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int test4() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
