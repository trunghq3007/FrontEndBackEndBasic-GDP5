/**
 * 
 */
package dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

/**
 * @author User
 *
 */
public class Dbconntion {
	private static String DB_URL = "jdbc:mysql://localhost:3306/asm_qldh";
	private static String USER_NAME = "root";
	private static String PASSWORD = "root";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}
}
