package fita.learning.core.java;

public class FirstExample {
	static int classVar;

	public static void main(String[] args) {
		System.out.println("Welcome to the Java World");
		printTable(2);
		printTable(3);
		
	}
	
	public static void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" X "+num +" = "+(num*i));
		}
	}

}
