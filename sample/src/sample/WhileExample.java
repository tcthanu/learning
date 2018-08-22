package sample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		int x[]= {12,13,14,15};
		int i=0;
		while (i < x.length) {
			System.out.println(x[i++]);			
		}
		int val=0;
		Scanner scan=new Scanner(System.in); 
		while(val != -1) {
			System.out.println("Enter the key value Exit");
			val=scan.nextInt();
			if( val != -1) {
			System.out.println("You entered a value :"+val + "is not the right key");
			}
		}
		System.out.println("Congrats you come out of loop");
	}

}
