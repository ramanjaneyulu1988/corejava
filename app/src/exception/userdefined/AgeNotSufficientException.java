package exception.userdefined;

public class AgeNotSufficientException extends RuntimeException
{
	public AgeNotSufficientException(String message)
	{
		super(message);
	}
}
