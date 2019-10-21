package com.stremeapi.entity;

public class Student {
	private int studentId;
	private String studentName;
	private String studentDepartment;
	private double studentSalary;
	public Student() {
		
	}
	public Student(int studentId, String studentName, String studentDepartment, double studentSalary) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.studentSalary = studentSalary;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	public double getStudentSalary() {
		return studentSalary;
	}
	public void setStudentSalary(double studentSalary) {
		this.studentSalary = studentSalary;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDepartment="
				+ studentDepartment + ", studentSalary=" + studentSalary + "]";
	}
	


}
