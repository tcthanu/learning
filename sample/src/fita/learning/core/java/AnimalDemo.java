package fita.learning.core.java;

import java.util.Scanner;

public class AnimalDemo {

	public static void main(String[] args) {
		System.out.println("Enter your option");
		System.out.println("1. Cow");
		System.out.println("2. Dog");
		System.out.println("3. Cat");
		Scanner input= new Scanner(System.in);
		int option =input.nextInt();
		Animal animal = null;
		switch(option) {
		case 1: animal = new Cow(); break;
		case 2: animal = new Dog(); break;
		case 3: animal = new Cat(); break;
		default: animal = new Animal();
		}
		if(animal != null)
			animal.sound();
	}

}
