package capgemini.a4.bank;

public class InsufficientBalanceException extends Exception{
	boolean z = true;
public InsufficientBalanceException() {}
public InsufficientBalanceException(String s)
{
	super(s);
}
public void checkBalance(double bal,double amt) throws InsufficientBalanceException
{
	try
	{
		if(bal<amt || amt<=0)
		{
			InsufficientBalanceException obj = new InsufficientBalanceException("Insufficient Balance ");
			throw obj;
		}
	}
	catch(InsufficientBalanceException obj)
	{
		throw obj;
	}
}

}
