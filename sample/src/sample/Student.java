package sample;

public class Student {
	private int regNo;
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
