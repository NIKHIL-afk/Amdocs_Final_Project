package com.amdocs.bank;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1=new BankAccount(500,10);
		BankAccount b2=new BankAccount(200,20);
		
		b1.withdraw(200);
		b2.deposit(1000);
		b2.transfer(500, b1);
		
		b1.checkBalance();
		b2.checkBalance();
		System.out.println("\n");
		
		SavingsAccount s1=new SavingsAccount(2000,1);
		s1.deposit(500);
		s1.checkBalance();
		System.out.println("\n");
		
		CurrentAccount c1=new CurrentAccount(2000,3);
		c1.deposit(500);
		c1.withdraw(100);
		c1.transfer(500, s1);
		c1.checkBalance();
		s1.checkBalance();
	}

}
