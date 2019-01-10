package com.cmc.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cmc.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<User> getAllUser() {
		Session session = entityManager.unwrap(Session.class);
		
		Query<User> createQuery = session.createQuery("from User", User.class);
		List<User> resultList = createQuery.getResultList();
		return resultList;
	}

	@Override
	public User login(User user) {
		Session session = entityManager.unwrap(Session.class);
		
		Query cQuery = session.createSQLQuery("select * from User where user_name:= username and password := passwprd").addEntity(User.class);
		cQuery.setParameter("username", user.getUsernName());
		cQuery.setParameter("password", user.getPassword());
		User uniqueResult = (User) cQuery.uniqueResult();
		return uniqueResult;
	}

	@Override
	public User signup(User user) {
Session session = entityManager.unwrap(Session.class);
		
		Query cQuery = session.createSQLQuery("insert into user( username,password) values (?,?)").addEntity(User.class);
		cQuery.setParameter("username", user.getUsernName());
		cQuery.setParameter("password", user.getPassword());
		User uniqueResult = (User) cQuery.uniqueResult();
		return uniqueResult;
	}
	
	

}
