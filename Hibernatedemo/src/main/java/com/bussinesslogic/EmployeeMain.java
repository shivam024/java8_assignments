package com.bussinesslogic;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employee.model.Employee;
import com.employee.util.HibernateUtil;

public class EmployeeMain {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Employee employee = new Employee("John Doe", "HR", 34000);
		session.save(employee);

		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();

	}
}
