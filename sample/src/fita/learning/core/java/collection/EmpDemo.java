package fita.learning.core.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpDemo {
	public static void main(String[] args) {
		List<Employee> empList =new ArrayList<Employee>();
		empList.add(new Employee(104, "Aditya", 50000));
		empList.add(new Employee(102, "Vinu", 52000));
		empList.add(new Employee(101, "Abhi", 55000));
		empList.add(new Employee(103, "Buvana", 52000));
		empList.add(new Employee(105, "Gopal", 62000));
		Collections.sort(empList);
		for(Employee e:empList) {
			System.out.println(e);
		}
		
	}
}
