package capgemini.a4.bank;

public class IllegalBankTransactionException extends Exception{
boolean z = true;
public IllegalBankTransactionException(){}
public IllegalBankTransactionException(String s)
{
	super(s);
}
	public void checkAmt(double amt) throws IllegalBankTransactionException
{
    try
    {
    	if(amt<0)
    	{
   
    		IllegalBankTransactionException obj = new IllegalBankTransactionException("Amount can't be negative");
    		throw obj;
    	}
    }
	catch(IllegalBankTransactionException obj)
    {
		throw obj;
    }

}
}
