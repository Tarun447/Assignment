package com.bank.org;

public class BankAccountServiceImpl implements BankAccountService{
	private BankAccount account;

	public double widthdraw(long accountId, double balance) {
		
			 if(account.getAccountId()==accountId) {
				 account.setBalance(account.getBalance()-balance);
				 return account.getBalance();
			 }
				
		 return 0;
	}

	public double deposit(long accountId, double balance) {
		
			 if(account.getAccountId()==accountId) {
				 account.setBalance(account.getBalance()+balance);
				 return account.getBalance();

				
		 }
		return 0;
	}

	public double getBalance(long accountId) {
		return 0;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "BankAccountServiceImpl [account=" + account + "]";
	}



	

}

