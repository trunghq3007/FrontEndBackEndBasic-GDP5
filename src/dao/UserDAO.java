package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import entity.User;
import utils.Constant;
import utils.DBConnection;

public class UserDAO implements BaseDAO<User>{

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}
	public User getUser(String username,String password) {
		User user = null;
		Connection connection = DBConnection.connect();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Constant.User.SELECT_LOGIN);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultset = preparedStatement.executeQuery();
			if(resultset.next()) {
				user = new User();
				user.setUsername(resultset.getString(Constant.User.userame));
				user.setPassword(resultset.getString(Constant.User.password));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
	}
	

}
