package com.service.exception;

public class Student {
	int roll_no;
	String name;
	int age;
	String course;
	//Constructor Using Fields
	public Student(int roll_no, String name, int age, String course) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;
	}
//this is simple getter setter methods
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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
//this is toString
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	

}
