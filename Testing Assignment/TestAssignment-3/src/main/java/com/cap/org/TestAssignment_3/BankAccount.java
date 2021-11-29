package com.cap.org.TestAssignment_3;

import javax.naming.InsufficientResourcesException;
public class BankAccount {
	int a;
	int BankAccountBalance = 20000;
public String Withdraw(int a) throws InsufficientFundException  {
	if(a< BankAccountBalance) {
		return ("wait for a momment");
	}
	else
	{
		throw new InsufficientFundException("Insufficient Funds");
	}
	
}
}