package jdbcdemo.dbutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtill {

	private static String DB_URL;
	private static String USERNAME;
	private static String PASSWORD;

	static {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("jdbc.properties"));
			DB_URL = properties.getProperty("URL");
			USERNAME = properties.getProperty("USERNAME");
			PASSWORD = properties.getProperty("PASSWORD");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}
}