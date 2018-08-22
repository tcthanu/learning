package sample;

import java.util.Scanner;

public class LogicalExample {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Mark1");
		int mark1=input.nextInt();
		System.out.println("Enter Mark2");
		int mark2=input.nextInt();
		if (mark1>=35 || mark2 >=35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
