package fita.learning.core.java;

public class EmpDemo {
	public static void main(String[] args) {
		Employee e= new Programmer();
		e.showDetail();
		e= new Manager();
		e.showDetail();
		
	}
}
