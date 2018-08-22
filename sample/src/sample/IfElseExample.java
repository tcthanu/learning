package sample;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,y,z,max;
		System.out.println("Enter first Value");
		x=input.nextInt();
		System.out.println("Enter Second Value");
		y=input.nextInt();
		System.out.println("Enter Third value");
		z=input.nextInt();
		boolean condition1=x>y;
		boolean condition2=x>z;
		boolean condition3=y>z;
		if(condition1) {
			if(condition2) {
				max=x;
			}else {
				max=z;
			}
		}else {
			if(condition3) {
				max=y;
			}else {
				max=z;
			}
		}
		System.out.println("Max values = "+max);
		
		max= x>y ? x:y;
		max= max>z?max:z;
		System.out.println("Max Value using Conditional ="+max);
	}

}
