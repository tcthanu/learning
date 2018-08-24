package fita.learning.core.java;

public class Account {
	private double accountBalance;
	public Account(double initialAmount) {
		accountBalance=initialAmount;
	}
	
	public void deposite(double amount) {
		System.out.println("Amount Deposited "+ amount);
		accountBalance+=amount;
		System.out.println("current balance "+ accountBalance);
	}
	public void withdraw(double amount) {
		if(accountBalance >= amount) {
			System.out.println("Amount withdrawn "+ amount);
			accountBalance-=amount;
			System.out.println(" Current balance "+ accountBalance);
		}else {			
			System.out.println("Insufficiant balance");
		}
	}
	public void balanceEnquiry() {
		System.out.println(" Current balance "+ accountBalance);
	}
	
}
