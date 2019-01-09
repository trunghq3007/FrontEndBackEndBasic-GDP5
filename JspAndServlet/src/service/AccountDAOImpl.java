package service;

import dao.AccountDAO;
import entity.Account;
import util.Constant;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public Account getAccount(String username) {
		Connection connection = DBConnection.connect();
		Account account = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Constant.Account.SQL_GET_ACCOUNT);
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				account = new Account(resultSet.getString(Constant.Account.USER_NAME),
						resultSet.getString(Constant.Account.PASSWORD));
			}
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {

		}
		return account;
	}

}
