package fita.learning.core.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import sample.Student;

public class StudentDemo {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student(1001, 20, "Gopal"));
		sList.add(new Student(1002, 22, "Abhi"));
		sList.add(new Student(1003, 19, "Vinu"));
		sList.add(new Student(1004, 18, "Buvana"));
		sList.add(new Student(1005, 21, "Aditya"));
		Collections.sort(sList, new AgeComparator());
		Iterator<Student> iter = sList.iterator();
		System.out.println("Age Comparator ");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collections.sort(sList, new NameComparator());
		System.out.println("\n\n Name Comparator");
		for (Student s : sList) {
			System.out.println(s);
		}
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getRegNo() == s2.getRegNo()) {
					return 0;
				} else {
					if (s1.getRegNo() > s2.getRegNo()) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		};
		Collections.sort(sList, comparator);
		
		System.out.println("\n\nReg No sorting \n");
		for (Student s : sList) {
			System.out.println(s);
		}
		
		double x= (double) 3/5;
		System.out.println(x);

	}
}
