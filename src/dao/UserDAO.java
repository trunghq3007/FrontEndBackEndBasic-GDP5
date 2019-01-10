/**
 * 
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import entity.User;

/**
 * @author User
 *
 */
public class UserDAO {
	public static List<User> getAllUser() {
		Connection conn = Dbconntion.getConnection();
		List<User> list = new ArrayList<User>();
		String sql ="select * from user";
		try {
			PreparedStatement prest = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = prest.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				list.add(user);
				prest.close();
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
