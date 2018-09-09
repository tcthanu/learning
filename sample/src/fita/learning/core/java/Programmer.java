package fita.learning.core.java;

public class Programmer extends Employee {

	
	@Override
	public void showDetail() {
		System.out.println("Over ride in Programmer");
	}

	public void showDetail(String x) {
		System.out.println("Hi This is Programmer");
	}

}
