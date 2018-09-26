package fita.learning.core.java.collection;

import java.util.Comparator;

import sample.Student;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
