package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pvhao
 *
 */
/**
 * Create by: pvhao - CMC
 * Create date: Jan 3, 2019
 * Modifier: pvhao
 * Modified date: Jan 3, 2019
 * Description: ....
 * Version 1.0
 */
public class DBConnection {

  
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // url
    static final String URL = "jdbc:mysql://localhost:3306/qldh?useSSL=false";
    // userName
    static final String USER_NAME = "root";
    // passWord
    static final String PASSWORD = "1234";

    /**
     * Create by: pvhao - CMC
     * Create date: Jan 3, 2019
     * Modifier: pvhao
     * Modified date: Jan 3, 2019
     * Description: ....
     * Version 1.0
     * @return
     */
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
    public static void main(String[] args) {
		Connection connection = connect();
		if(connection != null ) {
			System.out.println("Kết nối thành công");
		}
	}

}

