package com.training.myapp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.myapp.model.Student;
import com.training.myapp.model.StudentDao;

public class MyStudentDB {

	public static void main(String[] args) throws SQLException {
		StudentDao adstudent=new StudentDao();
//		//to call add method 
//		if(adstudent.addStudent(new Student("Rizwana", 27, "ANGULAR")))
//			System.out.println(" Student is added to record");
//		else
//			System.out.println("failed to add the record");
//		//to  display all elements
//		List<Student> students=adstudent.findAllStudents();
//		for(Student student:students)
//			System.out.println(student);
//		//to display the element by id
//		Student student = adstudent.findStudentById(27);
//	if(student != null)
//		System.out.println(student);
//		else
//		System.out.println("-- Employee Record not found --");	
//	//to delete element by id
//	if(adstudent.deleteStudent(3)) 
//	System.out.println(" -- Employee Record deleted successfully --");
//	else
//		System.out.println(" -- Failed to load record --");
	//to update element by id
//	if(adstudent.updateStudentById(79, new Student("Niharika","C##")))
//		System.out.println("updated record");
//	else
//		System.out.println("failed to update");
//	if(adstudent.updateStudentById(90, new Student("Nikhila","C")))
//		System.out.println("updated record");
//	else
//		System.out.println("failed to update");
		
//-----------------using CallableStatement find element by it------		
		if(adstudent.takeName(75)!=null)
			System.out.println(adstudent.takeName(75));
		else
			System.out.println("not found");
	}
	
	} 

