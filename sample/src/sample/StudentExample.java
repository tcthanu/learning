package sample;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		int regNo[] = new int[3];
		int age[]= new int[3];
		String name[]=new String[3];
		Scanner input=new Scanner(System.in);
		for(int index=0;index<3;index++) {
			System.out.println("Enter the RegNo");
			regNo[index]=input.nextInt();
			System.out.println("Enter the Name");
			name[index]=input.nextLine();
			if(name[index].trim().equals(""))
			  name[index]=input.nextLine();	
			System.out.println("Enter the age ");
			age[index]=input.nextInt();
		}
		for(int i=0;i<3;i++) {
			System.out.println("Name : "+name[i]+ "\t RegNo: "+regNo[i]
					+"\tAge "+age[i]);
		}
	}
}
