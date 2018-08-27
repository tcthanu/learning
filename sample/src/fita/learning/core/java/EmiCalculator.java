package fita.learning.core.java;

public class EmiCalculator {
	public static void main(String[] args) {
		double loanAmount=100000;
		double rateOfInterest= 15;
		double durationInYears = 3;
		double interest = loanAmount * (rateOfInterest /100) * durationInYears; 
		double totalAmount = loanAmount+ interest;
		double emi= totalAmount /(durationInYears*12);
		System.out.println(emi);
	}
}
