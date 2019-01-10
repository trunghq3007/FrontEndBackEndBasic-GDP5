package bll;

import java.sql.SQLException;
import java.util.List;

import com.dal.ContactDAL;
import com.entity.Contact;

public class ContactBLL implements BaseBLL<Contact>{
	ContactDAL contactDAL;
	
	public ContactBLL() {
		contactDAL = new ContactDAL();
	}
	@Override
	public List<Contact> getAll() {
		return contactDAL.getAll();
	}

	@Override
	public Contact getByCode(String code,String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Contact object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Contact object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Contact> fillter(String sequenceFilter) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean insertContact(Contact t) {
		return contactDAL.insertContact(t);
	}
	public boolean deleteContact(int id) throws SQLException {
		return contactDAL.deleteContact(id);
	}
	

}
