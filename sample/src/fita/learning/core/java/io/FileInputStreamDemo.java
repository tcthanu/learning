package fita.learning.core.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fita.learning.core.java.collection.NameComparator;
import sample.Student;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("Reading data from ... C:\\thanu\\Sample.txt");
		File txtFile = new File("C:\\thanu\\Sample.txt");
//		if (txtFile.canRead()) {
//			FileInputStream input = new FileInputStream(txtFile);
//			int data;
//			while ((data = input.read()) != -1) {
//				System.out.print((char) data);
//			}
//			input.close();
//		}else {
//			
//			System.out.println("unable to read the File " + txtFile.getName());
//		}
		//Example using scanner
			
		Scanner in =new Scanner(txtFile);
		String line;
		List<Student> studentList= new ArrayList<Student>();
		while(in.hasNextLine()) {
			line=in.nextLine();
			String s[] = line.split(",");
			int id=Integer.parseInt(s[0]);
			String name= s[1];
			int age=Integer.parseInt(s[2]);
			Student student= new Student(id,age,name);
			studentList.add(student);
		}
		System.out.println("Before Sorting");
		for(Student s:studentList) {
			s.printDetails();
		}
		Collections.sort(studentList, new NameComparator());
		System.out.println("After sortinng");
		for(Student s:studentList) {
			s.printDetails();
		}

		
		in.close();
	}

}
