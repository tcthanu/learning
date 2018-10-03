package sample;

import java.util.Scanner;

import fita.learning.core.java.MyInput;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("MyThread"+i);	
			Scanner scan = new Scanner(System.in);
			System.out.println("MyThread Input" + scan.nextLine());
		}
	}

}
