package sample;

public class Student {
	private int regNo;
	private int age;
	private String name;
	
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
	
	
	
	@Override
	public String toString() {
		return "Name "+name + "\t Reg No :"+regNo + " \tAge"+ age ;
	}

	public void printDetails() {
		System.out.println("Name "+name + "\t Reg No :"+regNo + " \tAge"+ age );
	}
	
	public static void main(String a[]) {
		Student s=new Student();
		System.out.println("Name "+s.name + "\t Reg No :"+s.regNo + " \tAge"+ s.age );
		
	}
 
}
