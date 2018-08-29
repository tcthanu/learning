package fita.learning.core.java;

import java.util.Scanner;

public class MyInput {
	static Scanner in=new Scanner(System.in);
	
	public static int readInt() {
		System.out.println("Please Enter an Integer :");
		return in.nextInt();
	}

}
