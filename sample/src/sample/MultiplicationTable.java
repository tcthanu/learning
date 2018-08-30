package sample;

import fita.learning.core.java.MyInput;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num =MyInput.in.nextInt();
		for(int i=1;i<=20;i++) {
			//System.out.println(i+" X "+num +" = "+ (i*num) );
			System.out.printf("%2d X %d  = %4d \n",i,num,(i*num));
		}
	}

}
