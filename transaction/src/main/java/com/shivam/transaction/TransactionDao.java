package com.shivam.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.jdbc.dbUtill.DbUtill;

public class TransactionDao {
	public boolean addTransaction(Transaction t) {

		String query = "INSERT INTO transaction (teacherName, teacherDepartment, teacherSalary) VALUES(?, ?, ?)";

		try (Connection connection = DbUtill.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, t.getTeacherName());
			statement.setDouble(3, t.getTeacherSalary());
			statement.setString(2, t.getTeacheDepartment());

			int count = statement.executeUpdate();
			if (count == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	}
