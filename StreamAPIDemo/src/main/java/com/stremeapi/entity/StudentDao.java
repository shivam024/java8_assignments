package com.stremeapi.entity;

import java.util.Arrays;
import java.util.List;

public class StudentDao {
	public List<Student> findAllStudent() {
		List<Student> student = Arrays.asList(
			new Student(101, "Johh Doe", "ECE", 45000),
			new Student(33, "Bob Marting", "ECE", 34000),
			new Student(66, "Jane Doe", "Mechnical", 12000),
			new Student(78, "Anna P", "CSE", 22000),
			new Student(12, "Bryan Bash", "ADMIN", 10000),
			new Student(33, "Kathy Sierra", "ACCOUNTS", 42000),
			new Student(99, "George King", "ACCOUNTS", 22000),
			new Student(345, "Mahesh Shelar", "ACCOUNTS", 18000),
			new Student(233, "Satyendra Singh", "DEVELOPER", 62000),
			new Student(189, "Sourabh Naik", "DEVELOPER", 55000),
			new Student(200, "Tushar Rane", "DEVELOPER", 58000)			
		);
		
		return student;

}
}
