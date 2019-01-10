package com.cmc.service;

import java.util.List;

import com.cmc.entity.Contact;

public interface ContactService {
	
public List<Contact> allContact();
	
	public void insertContact(Contact contact);
	
	public Contact getById(int id);
	
	public void deleteContact(int id);
}
