package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entity.UserContact;
import utils.Constant;
import utils.DBConnection;

public class UserContactDAO implements BaseDAO<UserContact>{

	@Override
	public List<UserContact> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(UserContact object) {
		Connection connection = DBConnection.connect();
		boolean result = false;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Constant.UserContact.INSERT);
			preparedStatement.setString(1, object.getFullName());
			preparedStatement.setString(2, object.getPhone());
			preparedStatement.setString(3, object.getAddress());
			preparedStatement.setString(4, object.getIsGraduation());
			preparedStatement.setString(5, object.getMajor());
			preparedStatement.setString(6, object.getEmai());	
			preparedStatement.executeUpdate();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public UserContact getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(UserContact object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
