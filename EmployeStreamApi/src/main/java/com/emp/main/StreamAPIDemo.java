package com.emp.main;

import java.util.List;
import java.util.function.Consumer;

import com.emp.dao.EmployeeDao;
import com.emp.model.Employee;

public class StreamAPIDemo {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		List<Employee> employees = dao.findAllEmployees();
//this gives the whole list of employee which is present in the table
		Consumer<Employee> c = (e) -> System.out.println(e);
		employees.forEach(c);

		
		
		
		
		

	}
}
