package com.fita.sample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentService {

	public String registerStudent(StudentRegistrationForm sform) {	
		try {
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/thanu","sa","");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into Student (id,name) values ((select max(id) from student)+1 ,'"+sform.getFirstName()+"')");
			sform.setMessage("Successfully Registered");
			return "Succussfully Registered";			
		} catch (ClassNotFoundException | SQLException e) {
			return "Some error occured";
		}
		
	}

}
