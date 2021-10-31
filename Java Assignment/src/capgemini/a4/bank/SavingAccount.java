package capgemini.a4.bank;

import java.util.Scanner;

public class SavingAccount extends Exception {
	public SavingAccount() {};
	public SavingAccount(String s) {
		super(s);
	}
	
	static double bal = 2000;
	public static void main(String[] args) {
	
		try(Scanner s = new Scanner(System.in))
		{
			try
			{
				System.out.println("Enter 11 digit Account number");
				String l = s.nextLine();
				if(l.length()!=11)
				{
					SavingAccount sa = new SavingAccount("Enter Valid Account Number");
					throw sa;
				}
				long acc = Long.parseLong(l);
				while(true)
				{
				  System.out.println("Do you want transaction 'Yes/No'");
				  String res = s.nextLine();
				  if(res.equalsIgnoreCase("yes"))
				  {
					  System.out.println("---------Make a choice----- ");
					  System.out.println("1.Withdraw\n2.Deposite");
						int ch = s.nextInt();
						if(ch==1)
						{
							try
							{
						      System.out.println("Enter Amount to be withdraw : ");
						      double amt  = s.nextDouble();
						      InsufficientBalanceException ob = new InsufficientBalanceException();
						      ob.checkBalance(bal,amt);
						      IllegalBankTransactionException obj = new IllegalBankTransactionException();
						      obj.checkAmt(amt);
						      System.out.println("your balance : "+bal);
						      bal = bal-amt;
						      System.out.println("After withdraw Your  balance  : "+bal);
							}
							catch(InsufficientBalanceException | IllegalBankTransactionException e)
							{
								throw e;
							}
						}
						if(ch==2)
						{
							try
							{
						      System.out.println("Enter Amount to be deposite: ");
						      double amt  = s.nextDouble();
						      IllegalBankTransactionException obj = new IllegalBankTransactionException();
						      obj.checkAmt(amt);

						      System.out.println("your balance : "+bal);
						      bal = bal+amt;
						      System.out.println("After deposite Your  balance  : "+bal);
							}
							catch( IllegalBankTransactionException  e)
							{
								throw e;
							}
						}
						if(ch>=3)
						{
							try
						{
							SavingAccount sa = new SavingAccount("Make a valid choice ");
							throw sa;
						}
						catch(SavingAccount a)
						{
							throw a;
						}
						}
				  }
				 if(res.equalsIgnoreCase("no"))
				  {
					  System.out.println("Thank You Visit Again");
					  break;
				  }
					
				}
	
			}
			catch(InsufficientBalanceException | IllegalBankTransactionException | SavingAccount e)
			{
				e.printStackTrace();
			}
		}

	}

}
