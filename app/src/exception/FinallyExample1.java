package exception;

public class FinallyExample1 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("JDBC/ File connection opened...");
			// Opened JDBC/ File connection
			
			int i = 100/10;
			System.out.println(i);
			
			// closing connection...
//			System.out.println("Inside try, JDBC/ File connection closed...");
		}
		catch (NullPointerException e) 
		{
			// closing connection...
//			System.out.println("Inside catch, JDBC/ File connection closed...");
		}
		finally
		{
			System.out.println("Inside finally, JDBC/ File connection closed...");
		}
	}
}
