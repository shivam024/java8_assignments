package com.training.myapp;

import java.sql.Connection;

import com.training.myapp.util.DBUtil;

public class DBConnectionTest {
	public static void main(String[] args) {
		try(Connection connection=DBUtil.getConnection()){
			if(connection!=null)
				System.out.println("---connected-----");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("--failed-----");
		}
	}

}
