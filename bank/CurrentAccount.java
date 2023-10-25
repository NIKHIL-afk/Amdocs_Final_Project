package com.amdocs.bank;


public class CurrentAccount extends BankAccount {
	public CurrentAccount(double intialAmount,int accountNo) {
		super(intialAmount,accountNo);
	}
	
	
	public void withdraw(double amount) {
	    try {
	    	if(amount>0) {
	    		if(showBalance()>200) {
	    			amount=amount+200;
	    			super.withdraw(amount);
	    			System.out.println("Amount Withdrawn from current account");
	    		}
	    		else {
	    			System.out.println("insufficient Balance...amount less than 200");
	    		}
	    	}
	    	else {
	    		System.out.println("Amount to be withdrawn is negative value");
	    	}
	   } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a numeric value for the deposit.");
	   }
	}
	
}
