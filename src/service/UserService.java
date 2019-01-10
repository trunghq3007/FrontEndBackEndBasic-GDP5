package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.UserDAO;
import entity.User;
import utils.Constant;
import utils.DBConnection;

public class UserService implements BaseService<User>{
	private UserDAO userDao ;
	public UserService() {
		userDao = new UserDAO();
	}
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
		return userDao.getUser(username, password);
		
	}

}
