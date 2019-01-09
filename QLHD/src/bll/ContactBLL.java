package bll;

import java.util.List;

import com.controller.ContactController;
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
	public Contact getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact createContactObject() {
		String[] userData = ContactController.getUserData();
		Contact contact = new Contact();
		contact.setName(userData[0]);
		contact.setPhone(Integer.parseInt(userData[1]));
		contact.setAddress(userData[2]);
		contact.setGraduate(userData[3]);
		contact.setMajor(userData[4]);
		contact.setEmail(userData[5]);
		
		return contact;
	}
	
	@Override
	public int insert(Contact object) {
		// TODO Auto-generated method stub
		contactDAL.insert(object);
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

}
