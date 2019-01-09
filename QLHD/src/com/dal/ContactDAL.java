package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Contact;
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
	public Contact getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Contact object) {
		int numEffect = -1;
		Connection conn = DbConnection.connect();
		try {
			PreparedStatement ppstmt = conn.prepareStatement(com.utils.Constants.contact.CONTACT_INSERT);
			ppstmt.setString(1, object.getName());
			ppstmt.setInt(2, object.getPhone());
			ppstmt.setString(3, object.getAddress());
			ppstmt.setString(4, object.getGraduate());
			ppstmt.setString(5, object.getMajor());
			ppstmt.setString(6, object.getEmail());
			numEffect = ppstmt.executeUpdate();
			
			ppstmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return numEffect;
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

}
