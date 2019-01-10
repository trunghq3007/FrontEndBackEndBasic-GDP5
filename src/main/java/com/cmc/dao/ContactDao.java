package com.cmc.dao;

import java.util.List;

import com.cmc.entity.Contact;

public interface ContactDao {
	
	public List<Contact> allContact();
	
	public void insertContact(Contact contact);
	
	public Contact getById(int id);
	
	public void deleteContact(int id);
}
