package fita.learning.core.java;

public class StringDemo {
	public static void main(String[] args) {
		String s="   Hello World    ";
		System.out.println(s);
		System.out.println("Length of the String s : " + s.length());
		s=s.trim();
		System.out.println(s);
		System.out.println("Length of the String s : " + s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(6));
		System.out.println(s.substring(0, 5));
		System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}
}
