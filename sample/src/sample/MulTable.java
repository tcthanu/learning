package sample;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter the Value");
//		int num=input.nextInt();
//		for(int var=1;var<=10;var++) {
//			System.out.println(var+" X "+num+" = "+ var*num);
//		}
		for(/*1*/int x=0;/*2*/x<5;System.out.print(x++)) {
			/* 3*/
			for(int y=x;y<=4;y++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
