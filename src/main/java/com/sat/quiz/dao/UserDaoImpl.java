package com.sat.quiz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sat.quiz.entity.User;



/*
 * Class used for DAO access method definition for User entity class
 * 
 * 
 * 
 */


@Repository
public class UserDaoImpl implements UserDao {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	
	// dao method for user find by user id service
	@Override
	public User findByUserId(Long id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using id
		Query<User> theQuery = currentSession.createQuery("from User where id=:uId", User.class);
		theQuery.setParameter("uId", id);
		User theUser = null;
		try {
			theUser = (User)theQuery.getSingleResult();
		} catch (Exception e) {
			theUser = null;
		}

		return theUser;
	}
	
	// dao method for user find by user name service
	@Override
	public User findByUserName(String theUserName) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using username
		Query<User> theQuery = currentSession.createQuery("from User where userName=:uName", User.class);
		theQuery.setParameter("uName", theUserName);
		User theUser = null;
		try {
			theUser = (User)theQuery.getSingleResult();
		} catch (Exception e) {
			theUser = null;
		}

		return theUser;
	}

	// dao method for user find all users service
	@Override
	public List<User> findAllUsers() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read all users from database
		Query<User> theQuery = currentSession.createQuery("from User", User.class);

		List<User> theUsers = null;
		try {
			theUsers = (List<User>)theQuery.getResultList();
		} catch (Exception e) {
			theUsers = null;
		}

		return theUsers;	
	}
	
	// dao method for user save user service
	@Override
	public void save(User theUser) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create the user  
		currentSession.saveOrUpdate(theUser);
	}
	
	// dao method for user save user service -- a 2nd version of the save user service -- TODO additional changes to this service
	@Override
	public void saveUser(User theUser) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the user  
		currentSession.saveOrUpdate(theUser);
	}
	

	// dao method for user delete service
	@Override
	public void delete(User user) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete the user  
		currentSession.delete(user);
	}





}
