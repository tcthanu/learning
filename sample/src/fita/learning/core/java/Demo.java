package fita.learning.core.java;

public class Demo {
	public static void main(String[] args) {
		int x=5;
		System.out.println(x);
		process(x);
		System.out.println(x);
		Account acc=new Account(1000);
		acc.balanceEnquiry();
		process(acc);
		acc.balanceEnquiry();
		
	}
	
 private static void process(int x) {
	 x=x+1;
 }
 private static void process(Account a) {
	 a.deposite(2000);
 }
}
