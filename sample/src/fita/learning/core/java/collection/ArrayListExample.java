package fita.learning.core.java.collection;

import java.util.ArrayList;

import sample.Student;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList();
		list.add("Vinu");
		list.add("Abhi");
		list.add("Aditya");
		Student s=new Student();
		list.add(s);
		System.out.println(list.size());
			for(Object o: list) {
			System.out.println(o);
		}
		list.remove(s);
		System.out.println(list.size());
		for(Object o: list) {
		System.out.println(o);
	}
		
	}
}
