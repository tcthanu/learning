package sample;

import java.util.Scanner;

public class StudentEx2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = input.nextLine();
		System.out.println("Enter Reg No:");
		int regNo = input.nextInt();
		System.out.println("Enter Age");
		int age = input.nextInt();
		Student s = new Student(regNo,age,name);
		s.printDetails();
	}
}
