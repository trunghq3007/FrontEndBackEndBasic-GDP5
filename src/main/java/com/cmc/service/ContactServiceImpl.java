package com.cmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmc.dao.ContactDao;
import com.cmc.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDao;

	@Override
	public List<Contact> allContact() {
		// TODO Auto-generated method stub
		return contactDao.allContact();
	}

	@Override
	public void insertContact(Contact contact) {
		// TODO Auto-generated method stub
		contactDao.insertContact(contact);
	}

	@Override
	public Contact getById(int id) {
		// TODO Auto-generated method stub
		return contactDao.getById(id);
	}

	@Override
	public void deleteContact(int id) {
		// TODO Auto-generated method stub
		contactDao.deleteContact(id);
	}

}
