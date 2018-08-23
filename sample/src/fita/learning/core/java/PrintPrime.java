package fita.learning.core.java;

public class PrintPrime {

	public static void main(String[] args) {
		for(int num=2;num<=100;num++) {
			boolean isPrime=true;
			for(int d=2;d<= num/2;d++) {
				if(num%d == 0) {
					isPrime=false;
					break;
				}
			}
		  if(isPrime) {
			  System.out.println(num);
		  }
		}
	}

}
