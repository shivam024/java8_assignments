package com.student.client;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.student.model.Student;
import com.student.util.HibernateUtil;


public class StudentMain {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Student student = new Student("Shivam Gupta", "Sant pual", 34000.00, "Bhopal");
		Student student1 = new Student("Sakshi deskmukh", "MIT", 94000.80, "Ujjain");
		
		
		
		session.save(student);
		session.save(student1);

		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();
	}

}
