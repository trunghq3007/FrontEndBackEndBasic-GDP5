package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.Constant;
import dao.UserInfoDAO;
import entity.UserInfo;
import util.DBConnection;

public class UserInfoDAOImpl implements UserInfoDAO {
	private static UserInfoDAOImpl instance = null;

	public static UserInfoDAOImpl getInstance() {
		if (instance == null) {
			instance = new UserInfoDAOImpl();
		}
		return instance;
	}

	@Override
	public int insertUserInfo(UserInfo userInfo) {
		Connection connection = DBConnection.connect();
		int success = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Constant.UserInfo.SQL_INSERT_USER_INFO);
			preparedStatement.setString(1, userInfo.getFullName());
			preparedStatement.setString(2, userInfo.getPhone());
			preparedStatement.setString(3, userInfo.getAddresss());
			preparedStatement.setString(4, userInfo.getGranduation());
			preparedStatement.setString(5, userInfo.getMajor());
			preparedStatement.setString(6, userInfo.getEmail());

			success = preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

}
