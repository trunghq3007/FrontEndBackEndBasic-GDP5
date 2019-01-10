/**
 * 
 */
package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import entity.Contact;

/**
 * @author User
 *
 */
public class ContactDAO {
	public int insertContact(Contact contact) {
		int result = 0;
		Connection conn = Dbconntion.getConnection();
		String sql = "Insert into contact (name, phone, address, graduate, major, email) values (?,?,?,?,?,?)";
		 try {
			 PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);	
			 pstm.setString(1, contact.getName());
			 pstm.setString(2, contact.getPhone());
			 pstm.setString(3, contact.getAddress());
			 pstm.setString(4, contact.getGraduate());
			 pstm.setString(5, contact.getMajor());
			 pstm.setString(6, contact.getEmail());
			 result = pstm.executeUpdate();
			 pstm.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			result = -1;
		}
		return result;
	}
}
