package com.shivam.bussinesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shivam.DBUtil.DBUtil;
import com.shivam.entity.Employee;

public class EmployeeDao {

	public boolean updateEmployee(Employee e) throws SQLException {

		String query = "UPDATE employee SET empployeeName=?, employeeDepartment=?, employeeSalary=? WHERE emp_Id=? ";

		PreparedStatement statement = null;
		try (Connection connection = DBUtil.getConnection()) {

//			statement = connection.prepareStatement(query);
//			statement.setInt(4, e.getEmpId());
//			statement.setString(1, e.getEmployeeName());
//			statement.setString(2, e.getEmployeeDepartment());
//			statement.setDouble(3, e.getEmployeeSalary());
			statement = connection.prepareStatement(query);
			statement.setInt(4, e.getEmpId());
			statement.setString(1, e.getEmployeeName());
			statement.setString(2, e.getEmployeeDepartment());
			statement.setDouble(3, e.getEmployeeSalary());

			statement.addBatch();

//			int[] AfterRowsAffected = statement.executeBatch();
//			System.out.println("rows affected");

		}

		catch (SQLException ex) {

			ex.printStackTrace();
		} finally {
			if (statement != null)
				statement.close();
		}

		return true;

	}

}
//	public boolean transaction(Employee e) throws IOException, SQLException {
//
//		Connection connection = DBUtil.getConnection();
//		try {
//			connection.setAutoCommit(false);
//			String query = "UPDATE employee SET empployeeName=? ,empployeeSalary=?, empployeeDepartment=? WHERE emp_Id=?";
//			PreparedStatement statement = null;
//			try {
////				statement = connection.prepareStatement(query);
////				statement.setInt(4, e.getEmpId());
////				statement.setString(1, e.getEmployeeName());
////				statement.setString(2, e.getEmployeeDepartment());
////				statement.setDouble(3, e.getEmployeeSalary());
////				statement.addBatch();
////				statement.setInt(4, 5);
//				statement = connection.prepareStatement(query);
//				statement.setInt(1, e.getEmpId());
//				statement.setString(2, e.getEmployeeName());
//				statement.setString(4, e.getEmployeeDepartment());
//				statement.setDouble(3, e.getEmployeeSalary());
//
//				statement.addBatch();
//				statement.setInt(4, 5);
//
//				statement.setString(1, "Shivam");
//				statement.setString(2, "HR");
//				statement.setDouble(3, 59080.0);
//				statement.addBatch();
//			} finally {
//				if (statement != null)
//					statement.close();
//			}
//
//			connection.commit();
//			System.out.println("--  Transaction Committed  -- ");
//		} catch (Exception ex) {
//			connection.rollback();
//			System.out.println("--  Transaction rolledback  --");
//		} finally {
//			if (connection != null)
//				connection.close();
//		}
//		return true;
//	}
//
//	public List<Employee> finalAllEmployees() {
//		String query3 = "SELECT * FROM Employees";
//		List<Employee> employee = new ArrayList<>();
//		try (Connection connection = DBUtil.getConnection();
//				PreparedStatement statement = connection.prepareStatement(query3);
//				ResultSet result = statement.executeQuery();) {
//
//			while (result.next()) {
//				Employee emp = new Employee(result.getInt(1), result.getString(2), result.getString(3),
//						result.getDouble(4));
//				employee.add(emp);
//			}
//
//		} catch (SQLException e) {
//		}
//		return employee;
//
//	}
//
//}
