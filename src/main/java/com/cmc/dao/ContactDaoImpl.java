package com.cmc.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cmc.entity.Contact;

@Repository
public class ContactDaoImpl implements ContactDao{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Contact> allContact() {
		Session session = entityManager.unwrap(Session.class);
		
		Query<Contact> createQuery = session.createQuery("from Contact", Contact.class);
		List<Contact> resultList = createQuery.getResultList();
		
		return resultList;
	}

	@Override
	public void insertContact(Contact contact) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(contact);
		
	}

	@Override
	public Contact getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Contact contact = session.get(Contact.class, id);
		
		return contact;
	}

	@Override
	public void deleteContact(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query createQuery = session.createQuery("delete from Contact where id :=id");
		createQuery.setParameter("id", id);
		createQuery.executeUpdate();
		
	}

}
