package com.jdbc.bean;

import java.util.Scanner;

public class TeacherMain {
	public static void main(String[] args) {

		TeacherDao dao = new TeacherDao();
		

		if (dao.addTeacher(new Teacher("Sakshi Browning", "IB", 8240)))
			System.out.println("-- Teacher Record added successfully --");
		else
			System.out.println("-- Failed to add record --");
	}

}
