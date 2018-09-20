package fita.learning.core.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
	public Demo2() {
		System.out.println("Demo2 Constructor");
	}

	static {
		System.out.println("Static block");

	}

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		List<String> list= new ArrayList<String>();
		System.out.println("Enter names");
		while (true) {
			String name = MyInput.in.nextLine();
			if (name.trim().equals("")) {
				break;
			}
			set.add(name);
			list.add(name);
		}
		System.out.println("Names from Set");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("Names From List");
		for(String name: list) {
			System.out.println(name);
		}
	}

}
