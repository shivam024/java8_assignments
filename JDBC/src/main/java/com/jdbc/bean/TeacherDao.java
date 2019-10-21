package com.jdbc.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.dbUtill.DbUtill;

public class TeacherDao {

	public boolean addTeacher(Teacher t) {

		String query = "INSERT INTO teacher (teacherName, teacherDepartment, teacherSalary) VALUES(?, ?, ?)";

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
	
//public boolean deleteTeacher(int teacherId) {
//		
//		Teacher teacher = findbyTeacherId(teacherId);
//		if(teacher == null)
//			return false;
//		else {
//			String query = "DELETE FROM teacher WHERE teacherId = " + teacherId;
//			
//			try (Connection connection = DbUtill.getConnection();
//					PreparedStatement statement = connection.prepareStatement(query)) {
//				int count = statement.executeUpdate();
//				if(count == 1)
//					return true;				
//			}
//			catch(SQLException e) {
//				e.printStackTrace();
//			}
//			return false;
//		}		
//		
//	}
public List<Teacher> findAllTeacher() {
		
		String query = "SELECT * FROM teacher";
		List<Teacher> employees = new ArrayList<>();
		
		try (Connection connection = DbUtill.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
		
			
			while(result.next()) {
				Teacher teacher = 
						new Teacher(result.getString(1), result.getString(2), result.getDouble(3));
						
				teacher.add(teacher);
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}



}
