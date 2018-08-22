package sample;

import java.util.Scanner;

public class StudentEx2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter Name");
		s.name = input.nextLine();
		System.out.println("Enter Reg No:");
		s.regNo = input.nextInt();
		System.out.println("Enter Age");
		s.age = input.nextInt();
		s.printDetails();
	}
}
