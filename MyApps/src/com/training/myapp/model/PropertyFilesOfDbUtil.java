//package com.training.myapp.model;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//import java.util.Properties;
//
//public class PropertyFilesOfDbUtil {
//	private static String USERNAME;
//	private static String PASSWORD;
//	public static String DB_URL;
//
//	public static void main(String[] args) throws IOException {
//		Properties p = new Properties();
//		p.setProperty("DB_URL", "jdbc:mysql://localhost:3306/temp");
//		p.setProperty("USERNAME", "root");
//		p.setProperty("PASSWORD", "root");
//		InputStream input = new FileInputStream(
//				"C:/Users/khbegum/Documents/workspace-sts-3.9.9.RELEASE/myapp/src/main/resources/xDb.properties");
//		OutputStream output = new FileOutputStream(
//				"C:/Users/khbegum/Documents/workspace-sts-3.9.9.RELEASE/myapp/src/main/resources/xDb.properties");
//		p.store(output, "wrk");
//		p.load(input);
//		DB_URL = p.getProperty("DB_URL");
//		System.out.println(DB_URL);
//		USERNAME = p.getProperty("USERNAME");
//		System.out.println(USERNAME);
//		PASSWORD = p.getProperty("PASSWORD");
//		System.out.println(PASSWORD);
//
//	}
//
//}
