package com.fita.sample;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;

public class EmpServiceTest {
	EmployeeService service = new EmployeeService();
	@Test
	public void addEmp() throws Exception {		
		service.addEmployee("Vinu", "Pavithra", 50000);
	}

	@Test
	public void listEmp() throws Exception {
		List<Employee> list = service.listEmployees();
		list.forEach(System.out::println);
		assertTrue(list.size()>0);
	}
	
	@Test
	public void update() throws Exception {
		service.updateEmployee(2, 60000);
	}
	
	private void deleteAll() {
		// TODO Auto-generated method stub
		List<Employee> list= service.listEmployees();
		IntStream.range(0, list.size()).mapToObj(service::deleteEmployee);
	}
}
