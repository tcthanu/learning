package fita.learning.core.java.collection;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import sample.Student;

public class MapStudentExaple {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("c:/thanu/Sample.txt"));
		String line;
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		while ((line = reader.readLine()) != null) {
			String[] splited = line.split(",");
			int regNo = Integer.parseInt(splited[0]);
			String name = splited[1];
			int age = Integer.parseInt(splited[2]);
			Student s = new Student(regNo, age, name);
			studentMap.put(regNo, s);
		}
		reader.close();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the RegNo to find the detail of a student ");
			System.out.println("Enter -1 to exit");
			int regNo = input.nextInt();
			if (regNo == -1) {
				System.out.println("Bye Bye");
				break;
			}
			Student stu = studentMap.get(regNo);
			if (stu == null) {
				System.out.println("Student data not found");
			} else {
				stu.printDetails();
			}
		}
		
		input.close();
		
	}
}
