package com.dal;

import java.util.List;

import com.entity.Contact;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Constants;
import com.mysql.jdbc.PreparedStatement;
import com.utils.DbConnection;

public class ContactDAL implements BaseDAL<Contact>{

	@Override
	public List<Contact> getAll() {
		Connection connect = DbConnection.connect();
		List<Contact> contacts = new ArrayList<Contact>();

		try {
			// Statement creation
			Statement statement = connect.createStatement();
			// for retrieve data
			ResultSet resultSet = statement.executeQuery(com.utils.Constants.contact.CONTACT_ALLCONTACT);
			while (resultSet.next()) {
				Contact contact = new Contact();
				contact.setId(resultSet.getInt(com.utils.Constants.contact.CONTACT_ID));
				contact.setName(resultSet.getString(com.utils.Constants.contact.CONTACT_NAME));
				contact.setPhone(resultSet.getInt(com.utils.Constants.contact.CONTACT_PHONE));
				contact.setAddress(resultSet.getString(com.utils.Constants.contact.CONTACT_ADDRESS));
				contact.setGraduate(resultSet.getString(com.utils.Constants.contact.CONTACT_GRADUATE));
				contact.setMajor(resultSet.getString(com.utils.Constants.contact.CONTACT_MAJOR));
				contact.setEmail(resultSet.getString(com.utils.Constants.contact.CONTACT_EMAIL));
				contacts.add(contact);
			}
			statement.close();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contacts;
	}

	@Override
	public Contact getByCode(String code,String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Contact object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Contact object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Contact> fillter(String sequenceFillter) {
		// TODO Auto-generated method stub
		return null;
	}
	//them moi du lieu
	public boolean insertContact(Contact t) {
		Connection conn = DbConnection.connect();
		String sql=com.utils.Constants.contact.CONTACT_SERLECT;
		try
		{
			PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
			
			ps.setString(1, t.getName());
			ps.setInt(2, t.getPhone());
			ps.setString(3, t.getAddress());
			ps.setString(4, t.getGraduate());
			ps.setString(5, t.getMajor());
			ps.setString(6, t.getEmail());
			return ps.executeUpdate()==1;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	//xoa du lieu
	public boolean deleteContact(int id) throws SQLException {
	    try {
	    	Connection conn = DbConnection.connect();
	        String sql =com.utils.Constants.contact.CONTACT_DELETE;
	        PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
	        ps.setInt(1, id);;
	        return ps.executeUpdate()==1;
	    } catch (Exception e) {
	        return false;
	    }
	}
}
