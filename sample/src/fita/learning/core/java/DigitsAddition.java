package fita.learning.core.java;

public class DigitsAddition {

	public static void main(String[] args) {
		int sum = 0;
		int num = 12;
		
		do {
			sum=0;
			while(num>0) {
				int a = num%10;
				sum=sum+a;
				num=num/10;
			}
			if(sum>=10) {
				num=sum;
			}
		}while(sum>=10);
		
		System.out.println(sum);
	}

}
