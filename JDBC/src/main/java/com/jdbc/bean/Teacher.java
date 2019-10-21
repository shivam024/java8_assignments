package com.jdbc.bean;

public class Teacher {
	private int teacherId;
	private String teacherName;
	private String teacheDepartment;
	private double teacherSalary;
	
	public Teacher(int teacherId, String teacherName, String teacheDepartment, double teacherSalary) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacheDepartment = teacheDepartment;
		this.teacherSalary = teacherSalary;
	}
	public Teacher(String teacherName, String teacheDepartment, double teacherSalary) {
		super();
		this.teacherName = teacherName;
		this.teacheDepartment = teacheDepartment;
		this.teacherSalary = teacherSalary;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacheDepartment() {
		return teacheDepartment;
	}
	public void setTeacheDepartment(String teacheDepartment) {
		this.teacheDepartment = teacheDepartment;
	}
	public double getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(double teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacheDepartment="
				+ teacheDepartment + ", teacherSalary=" + teacherSalary + "]";
	}
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}
	
	

}
