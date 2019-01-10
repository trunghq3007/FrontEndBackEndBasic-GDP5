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
		return userDAL.getAll();
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
	
	public static void main(String[] args) {
		UserBLL u = new UserBLL();
		u.get("a", "1");
		System.out.println(u.get("a", "0"));
	}
	@Override
	public User getByCode(String code,String pass) {
		return userDAL.getByCode(code, pass);
	}
	public static boolean cc(String user_name, String user_pass) {
	return UserDAL.cc(user_name, user_pass);
	}

}
