package capgemini.a2;

import java.util.Scanner;

class Bank
{
	static int balance = 10000;
	public void account(int amt)
	{
		System.out.println("Your balance : "+amt);
	}
}

class SavingAccount extends Bank
{
	public void account(int amt)
	{
      final int fix = balance+amt;
		System.out.println("Your balance : "+(balance));
		System.out.println("Your fixed amount : "+amt);
		System.out.println("Your TotalSalary after fixed deposite : "+fix);
	}
}

class CurrentAccount extends Bank
{
	public void account(int amt)
	{
		
		System.out.println("Your balance : "+(balance));
		System.out.println("Your credited amount : "+amt);
		balance = balance+amt;
		System.out.println("Your TotalSalary  after credited amount : "+balance);
	}
}

public class BankAcc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("--------Choice--------");
		System.out.println("1.Saving Account\n2.Current Account");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1:
			SavingAccount sa = new SavingAccount();
			
			System.out.println("Enter Fixed Amount : ");
			int fx = s.nextInt();
			sa.account(fx);
	        break;
		case 2:
			CurrentAccount ca = new CurrentAccount();
			System.out.println("Enter Your Credited Salary: ");
			int crd= s.nextInt();
			ca.account(crd);
		}
		
	}

}
