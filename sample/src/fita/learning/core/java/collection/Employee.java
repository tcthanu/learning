package fita.learning.core.java.collection;

public class Employee implements Comparable<Employee> {
	@Override
	public String toString() {
		return "Id : "+id +"\tName : "+name+"\tSal: "+salary;
	}

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
//		if(this.id == e.id) {
//			return 0;//return this.name.compareTo(e.name);
//		}
//		if(this.id > e.id) {
//			return 1;
//		}else {
//			return -1;
//		}
	}
	
}
