package com.amdocs.bank;


public class SavingsAccount extends BankAccount {
	
	private double interest;
	
	public SavingsAccount(double initialamount,int accountNo) {
		super(initialamount,accountNo);
		
		
	}
	public void deposit(double amount) {

		interest=amount*0.03;
		amount=amount+interest;
		try {
			if(amount>0) {
				super.deposit(amount);
				System.out.println("Amount Deposited to savings account");
			}
			else {
				System.out.println("Amount to be Deposited is negative value");
			}

		 } catch (NumberFormatException e) {
	         System.out.println("Invalid input. Please enter a numeric value for the deposit.");
	     }
	    
		
	}
	

	
}
