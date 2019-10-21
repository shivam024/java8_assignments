package com.shivam.bussinesslogic;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.shivam.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		int empId;
		String employeeName;
		String employeeDepartment;
		Double employeeSalary;
		Scanner sc = new Scanner(System.in);

		System.out.println("Employee id");
		empId = sc.nextInt();
		System.out.println("Enter employee name");
		employeeName = sc.next();
		System.out.println("Enter employee Department");
		employeeDepartment = sc.next();
		System.out.println("Enter employee Salary");
		employeeSalary = sc.nextDouble();

		EmployeeDao dao = new EmployeeDao();

		try {
			if (dao.updateEmployee(new Employee(empId, employeeName, employeeDepartment, employeeSalary)))
				System.out.println(" Employee details updated successfully");
			else
				System.out.println("Update failed");
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		List<Employee> employees = dao.finalAllEmployees();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
	}

}
