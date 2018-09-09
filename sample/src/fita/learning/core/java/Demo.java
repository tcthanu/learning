package fita.learning.core.java;

public class Demo {
	public static void main(String[] args) {
		int result = process(15);
		System.out.println(result);
		Account acc=new Account(1000);
		acc.balanceEnquiry();
		process(acc);
		acc.balanceEnquiry();
		
	}
	
 private static int process(int x) {
	 
	 return x+1;
 }
 private static void process(Account a) {
	 a.deposite(2000);
 }
}
