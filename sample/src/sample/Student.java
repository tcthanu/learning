package sample;

public class Student {
	int regNo;
	int age;
	String name;
	
	public Student() {
		System.out.println("Default constructor");
		regNo=100;
		name="not defined";
		age =10;
	}
	
	public Student(int regNo,int age,String name) {
		this.regNo = regNo;
		this.age = age;
		this.name = name;
		
	}
	
	public void printDetails() {
		System.out.println("Name "+name + "\t Reg No :"+regNo + " \tAge"+ age );
	}
 
}
