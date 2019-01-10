package service;

import dao.AccountDAO;
import dao.Constant;
import entity.Account;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAOImpl implements AccountDAO {

	private static AccountDAOImpl instance;

	private AccountDAOImpl() {

	}

	public static AccountDAOImpl getInstance() {
		if (instance == null) {
			instance = new AccountDAOImpl();
		}
		return instance;
	}

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

	@Override
	public boolean validateAccount(String username, String password) {
		Connection connection = DBConnection.connect();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Constant.Account.SQL_GET_ACCOUNT);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return true;
			}
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
