package exception.userdefined;

public class BankBalanceNotSufficientException extends RuntimeException
{
	public BankBalanceNotSufficientException(String message)
	{
		super(message);
	}
}
