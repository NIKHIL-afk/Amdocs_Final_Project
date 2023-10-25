package com.amdocs.bank;

public class BankAccount {
	private int accountNo;
	private double balance;
	
	public BankAccount(double initialAmount,int  accountNo) {
	try {
		if(initialAmount>0 && accountNo>0) {
			this.balance=initialAmount;
			this.accountNo=accountNo;
			System.out.println("Account No. "+this.accountNo+ " created with balance "+balance);
			
		}
		else {
			System.out.println("Invalid balance or account detail");
		}
		
	 } catch (NumberFormatException e) {
         System.out.println("Invalid input. Please enter a numeric value for the deposit.");
     }
		
	}
	
	public int showAccountNo() {
		return accountNo;
	}
	public double showBalance() {
		return balance;
	}
	public void deposit(double amount){
	try {
		if(amount>0)
		{balance=balance+amount;
		System.out.println("Amount successfully deposited to Account No. "+this.accountNo);
		}
		else {
			System.out.println(" Deposited Amount is negative");
		}
	 } catch (NumberFormatException e) {
         System.out.println("Invalid input. Please enter a numeric value for the deposit.");
     }
	}
	
	public void withdraw(double amount) {
	try {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Amount successfully Withdrawn from Account NO. " + this.accountNo);
		}
		else {
			System.out.println("Amount is greater than balance or Amount entered is negative");
		}
	 } catch (NumberFormatException e) {
         System.out.println("Invalid input. Please enter a numeric value for the withdrawal.");
       }
		
	}
	public void checkBalance(){
		System.out.println("Balance of "+this.showAccountNo()+" "+balance);
	}
	public void transfer(double amount,BankAccount b2) {

		if(amount>0 && amount<=this.balance) {
			this.withdraw(amount);
			b2.deposit(amount);
			System.out.println("Amount transferred from Account No. "+this.showAccountNo() +" to "+b2.showAccountNo());
		}
		else {
			System.out.println("Insufficient balance or transferable amount is negative");
		}
			
		
		
	}
	
	
	
}
