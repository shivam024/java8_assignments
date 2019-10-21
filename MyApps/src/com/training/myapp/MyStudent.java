package com.training.myapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.training.myapp.exception.AgeNotWithInRangeException;
import com.training.myapp.exception.NameNotValidException;
import com.training.myapp.model.Student;

public class MyStudent {

	public static void main(String[] args) throws AgeNotWithInRangeException, NameNotValidException {
		// TODO Auto-generated method stub
//Student student=new Student(1,"Smiley",23,"Java");
//student.checkage(22);
//Student student1=new Student(2,"kjjh",16,"Java");
//student1.checkage(16);
//student1.checkName("hloo7");
List<Student> students=new ArrayList<Student>();
students.add(new Student(101, "Khairunnisa", 22, "Angular"));
students.add(new Student(102, "Siri", 22, "React"));
students.add(new Student(103, "Sahithi", 22, "ServiceNow"));
students.add(new Student(104, "Rahul", 22, "java"));
Function<Student, String> studentName=(s)->s.getName();

	

List<String> studentNames=students.stream().map(studentName).collect(Collectors.toList());

studentNames.removeIf((s)->s.length()%2!=0);//predicate functional interface is used return type is boolean

studentNames.forEach(e->System.out.println(e));// for each method added in java 8




	}

}
