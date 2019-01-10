package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	// url
	static final String URL = "jdbc:mysql://localhost:3306/jspandservlet?useSSL=false";
	// userName
	static final String USER_NAME = "root";
	// passWord
	static final String PASSWORD = "";

	public static Connection connect() {
		// load driver
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// get connection instance
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
