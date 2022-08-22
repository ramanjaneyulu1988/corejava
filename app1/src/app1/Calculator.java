package app1;

public class Calculator 
{
	
	private Double salary = 45000.0;
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(20, 50));
		c.sub(40, 30);
		c.mul(30, 5);
		c.div(50, 5);
	}
	
	public int add(int i, int j)
	{
		int k = i+j;
		return k;
	}
	
	protected int sub(int i, int j)
	{
		int k = i-j;
		return k;
	}
	
	int mul(int i, int j)
	{
		int k = i*j;
		return k;
	}
	
	private int div(int i, int j)
	{
		int k = i/j;
		return k;
	}
}
