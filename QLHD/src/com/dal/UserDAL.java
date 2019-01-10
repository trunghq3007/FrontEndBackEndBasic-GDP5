package com.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Contact;
import com.entity.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utils.Constants;
import com.utils.DbConnection;


public class UserDAL implements BaseDAL<User>{

	@Override
	public List<User> getAll() {
		Connection connect = (Connection) DbConnection.connect();
		List<User> users = new ArrayList<User>();

		try {
			// Statement creation
			Statement statement = connect.createStatement();
			// for retrieve data
			ResultSet resultSet = statement.executeQuery(com.utils.Constants.user.USER_ALLUSE);
			while (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt(com.utils.Constants.user.USER_ID));
				user.setUsername(resultSet.getString(com.utils.Constants.user.USER_USERNAME));
				user.setPassword(resultSet.getString(com.utils.Constants.user.USER_PASSWORD));
				users.add(user);
			}
			statement.close();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User getByCode(String code,String pass) {
		User user = new User();
		Connection connection = (Connection) DbConnection.connect();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(com.utils.Constants.user.SELECT_ONE);
			preparedStatement.setString(1, code);
			preparedStatement.setString(2, pass);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setUsername(resultSet.getString(com.utils.Constants.user.USER_USERNAME));
				user.setPassword(resultSet.getString(com.utils.Constants.user.USER_PASSWORD));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public int insert(User object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> fillter(String sequenceFillter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int get(String code,String pass) {
		Connection connection = (Connection) DbConnection.connect();
		int executeUpdate = -1;
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(com.utils.Constants.user.SELECT_ONE);
			preparedStatement.setString(1, code);
			preparedStatement.setString(2, pass);
			executeUpdate = preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return executeUpdate;
	
	}
	

	public static boolean cc(String user_name, String user_pass) {
		Connection con = (Connection) DbConnection.connect();
		 String sql = com.utils.Constants.user.SELECT_ONE;
		 PreparedStatement ps;
		 boolean t= false;
		 try {
		 ps = (PreparedStatement) con.prepareStatement(sql);
		 ResultSet rs = ps.executeQuery();
		 t= rs.next();
	}catch (SQLException e) {
		 e.printStackTrace();
		 }
		 return t;
}
	
}
