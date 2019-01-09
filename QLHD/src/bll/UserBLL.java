package bll;

import java.util.List;

import com.dal.UserDAL;
import com.entity.User;

public class UserBLL implements BaseBLL<User>{
	UserDAL userDAL ;
	public UserBLL(){
		userDAL = new UserDAL();
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
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
	public List<User> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}
	public int get(String code,String pass) {
		return userDAL.get(code, pass);
	}

}
