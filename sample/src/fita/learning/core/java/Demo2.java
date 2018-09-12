package fita.learning.core.java;

public class Demo2 {
	public Demo2() {
		System.out.println("Demo2 Constructor");
	}
	static{
		System.out.println("Static block");
		
	}
	public static void main(String[] args) {
		
		for(String name:args) {
			System.out.print(name+"\t");
		}
	}
	public double getCache() {
		return 1.5;
	}
}
