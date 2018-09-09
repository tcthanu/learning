package fita.learning.core.java;

import sample.Student;

public class StringDemo2 {

	public static void main(String[] args) {
		String s="Hi";
		s=s.concat("Hello");
		System.out.println(s.length());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println(s.indexOf("Hi"));
		System.out.println(s.indexOf("Hello"));
		System.out.println(s.indexOf("H"));
		System.out.println(s.lastIndexOf("H"));
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(0,3));
		//System.out.println(s.substring(3,8));
		System.out.println(s.substring(s.lastIndexOf("H")));
		System.out.println(s.indexOf("What"));
		
		StringBuffer sb=new StringBuffer("Hi");;
			
		sb.append(" Hello");
		sb.append(" How");
		System.out.println(sb);
		
		s = "Buvana,1001,20";
		String[] values = s.split(",");
		Student student=new Student(Integer.valueOf(values[1]),Integer.valueOf(values[2]),values[0]);
		
		student.printDetails();
		
		for(String val:values) {
			System.out.println(val);
		}
		
		//System.out.println(s.substring(s.lastIndexOf("H")));
	}

}
