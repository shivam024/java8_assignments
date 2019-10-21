package com.training.myapp.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.myapp.util.DBUtil;

public class StudentDao {
	public boolean addStudent(Student student) {

		String query = "INSERT INTO students (student_name, student_age, student_course) VALUES(?, ?, ?)";

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, student.getName());
			statement.setDouble(2, student.getAge());
			statement.setString(3, student.getCourse());

			int count = statement.executeUpdate();
			if (count == 1)
				return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public List<Student> findAllStudents() {

		String query = "SELECT * FROM students";
		List<Student> students = new ArrayList<>();

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {

			while (result.next()) {
				Student student = new Student(result.getInt(1), result.getString(2), result.getInt(3),
						result.getString(4));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return students;
	}

	public boolean deleteStudent(int roll) {

		Student student = findStudentById(roll);
		if (student == null)
			return false;
		else {
			String query = "DELETE FROM students WHERE student_roll = " + roll;

			try (Connection connection = DBUtil.getConnection();
					PreparedStatement statement = connection.prepareStatement(query)) {
				int count = statement.executeUpdate();
				if (count == 1)
					return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public Student findStudentById(int roll) {
		String query = "SELECT * FROM students WHERE student_roll = " + roll;
		Student student = null;

		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {

			if (result.next()) {
				student = new Student(result.getInt(1), result.getString(2), result.getInt(3), result.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	public boolean updateStudentById(int roll, Student student) throws SQLException{
		Student student1 = findStudentById(roll);
		String s = student.getCourse();
		System.out.println(s);

		// ---------------simple update method---------------------
//String query="UPDATE students SET student_course="+student.getCourse()+" WHERE student_roll="+roll;
//		try(Connection connection=DBUtil.getConnection();
//				PreparedStatement statement=connection.prepareStatement(query))
//				{
//
//			int count = statement.executeUpdate();
//			if(count == 1)
//				return true;
//			
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return false;
		// -------------update method using batches--------------
//		try(Connection connection=DBUtil.getConnection();
//				PreparedStatement statement=connection.prepareStatement(query))
//				{
//	statement.setString(1, student.getName());
//	statement.setString(2, student.getCourse());
//	statement.addBatch();
//	statement.setString(1, student.getName());
//	statement.setString(2, student.getCourse());
//	statement.addBatch();
//	int[] affectedrecords=statement.executeBatch();
//			
//			if(affectedrecords.length== 2)
//				return true;
//			
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return false;
		//int count = 0;
		String query = "UPDATE students SET student_name=?, student_course=? WHERE student_roll=" + roll;
		Connection connection = DBUtil.getConnection();
		if(student1==null) {
			return false;
		}
		else {
		try (
				PreparedStatement statement1 = connection.prepareStatement(query);) {

			connection.setAutoCommit(false);
			// PreparedStatement statement=null;
			// try(PreparedStatement statement1=connection.prepareStatement(query);){
			try {
				statement1.setString(1, student.getName());
				statement1.setString(2, student.getCourse());
				statement1.addBatch();

				statement1.setString(1, student.getName());
				statement1.setString(2, student.getCourse());
				statement1.addBatch();
				//count++;
				int[] affectedrecords = statement1.executeBatch();
				System.out.println(affectedrecords.length + " rows updated");
				connection.commit();
				if (affectedrecords.length == 2)
					return true;
			} finally {
				 if(statement1 != null) {
			            statement1.close();
			        }
			}}
		

		catch (Exception e) {
			connection.rollback();
		}
		finally {
		    if(connection != null) {
		        connection.close();
		    }}
		return false;

	}}
	//----find element by id using callable statement----
	public String takeName(int roll) {
		String query="{call takeName(?,?)}";
		Student student=findStudentById(roll);
		String str = null;
		try(Connection connection=DBUtil.getConnection();
				CallableStatement statement=connection.prepareCall(query)){
			statement.setInt(1, roll);
			statement.executeUpdate();
			statement.registerOutParameter(2, java.sql.Types.VARCHAR);
			//ResultSet result = statement.executeQuery(); 
			
			//while(result.next()) {}
				 str=statement.getString(2);
				 
				
				
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return str;
		
	}
	

	}
