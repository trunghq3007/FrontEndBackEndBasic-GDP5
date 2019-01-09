package com.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.entity.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.utils.Constants;
import com.utils.DbConnection;


public class UserDAL implements BaseDAL<User>{

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByCode(String code) {
		User user = new User();
		Connection connection = (Connection) DbConnection.connect();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) connection
					.prepareStatement(Constants.user.SELECT_ONE);
			preparedStatement.setString(1, code);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setUsername(resultSet.getString(Constants.user.USER_USERNAME));
				user.setPassword(resultSet.getString(Constants.user.USER_PASSWORD));
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
					.prepareStatement(Constants.user.SELECT_ONE);
			preparedStatement.setString(1, code);
			preparedStatement.setString(2, pass);
			executeUpdate = preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return executeUpdate;
	
	}

}
