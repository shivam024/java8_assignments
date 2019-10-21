package com.training.myapp.model;

import com.training.myapp.exception.AgeNotWithInRangeException;
import com.training.myapp.exception.NameNotValidException;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;
	

	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public Student(String course) {
		super();
		
		this.course = course;
		
	}
	

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}

	public Student(String name, int age, String course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;

	}

	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		
		this.course = course;
	}

	public static boolean checkage(int age) throws AgeNotWithInRangeException {

		if (age >= 15 && age <= 22) {
			System.out.println("This Student is Qualified as his/her age is" + age);
			return true;
		} else
			throw new AgeNotWithInRangeException("Age is not with in range disqualify him/her");

	}

	public static boolean checkName(String name) throws NameNotValidException {

		if (name.matches("^[a-zA-z]*$")) {
			System.out.println("valid name");
			return true;

		} else {

			throw new NameNotValidException(
					"InValid name,Give the name which doesnot include numbers and special symbols");
		}
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}

}
