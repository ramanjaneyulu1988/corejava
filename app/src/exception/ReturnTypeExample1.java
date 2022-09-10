package exception;

public class ReturnTypeExample1 {

	public static void main(String[] args) {
		
		ReturnTypeExample1 obj = new ReturnTypeExample1();
		
		System.out.println(obj.test());
	}
	
	public int test()
	{
		System.out.println("main method start");
		try
		{
			int i = 10/0;
//			return 10;
		}
		catch (Exception e) {
			
			return 20;
		}
		finally
		{
//			return 70;
		}
		
		return 80;
	}
}
